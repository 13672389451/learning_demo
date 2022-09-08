package com.atguigu.mvc.config;

import com.atguigu.mvc.interceptor.TestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import java.util.List;
import java.util.Properties;

@Configuration
//1：扫描组件
@ComponentScan("com.atguigu.mvc.controller")
//2:mvc 注解驱动
@EnableWebMvc

public class WebConfig implements WebMvcConfigurer {

    //配置生成模板解析器
     @Bean
     public ITemplateResolver templateResolver() {
         WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
         // ServletContextTemplateResolver需要一个ServletContext作为构造参数，可通过 WebApplicationContext 的方法获得
         ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver( webApplicationContext.getServletContext());
         templateResolver.setPrefix("/WEB-INF/templates/"); templateResolver.setSuffix(".html");

         templateResolver.setCharacterEncoding("UTF-8"); templateResolver.setTemplateMode(TemplateMode.HTML);
         return templateResolver;

     }

     //生成模板引擎并为模板引擎注入模板解析器
    @Bean
    public SpringTemplateEngine templateEngine(ITemplateResolver templateResolver) {
         SpringTemplateEngine templateEngine = new SpringTemplateEngine();
         templateEngine.setTemplateResolver(templateResolver);
         return templateEngine;

     }

     //生成视图解析器并未解析器注入模板引擎
    @Bean
    public ViewResolver viewResolver(SpringTemplateEngine templateEngine) {
         ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();

         viewResolver.setCharacterEncoding("UTF-8");

         viewResolver.setTemplateEngine(templateEngine);

         return viewResolver;
     }

//default-servlet-handler
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        TestInterceptor testInterceptor = new TestInterceptor();

        registry.addInterceptor(testInterceptor).addPathPatterns("/**");

    }

    //视图解析器 view-controller
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       registry.addViewController("/hello").setViewName("hello");
    }

    //文件上传解析器
    @Bean
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        return commonsMultipartResolver;
    }

    //异常处理
    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        SimpleMappingExceptionResolver simpleMappingExceptionResolver = new SimpleMappingExceptionResolver();
        Properties prop = new Properties();
        prop.setProperty("java.lang.ArithmeticException","error");
        simpleMappingExceptionResolver.setExceptionMappings(prop);
        simpleMappingExceptionResolver.setExceptionAttribute("exception");

        resolvers.add(simpleMappingExceptionResolver);
    }
}
