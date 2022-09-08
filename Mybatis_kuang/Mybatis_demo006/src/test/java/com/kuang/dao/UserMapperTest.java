package com.kuang.dao;
import com.kuang.pojo.Blog;
import com.kuang.utils.IDutils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(String.valueOf(UserMapperTest.class));

    @Test
    public void addBlogTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        System.out.println(mapper);


       Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreate_time(new Date());
        blog.setView(9999);

        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("微服务");
        mapper.addBlog(blog);


        sqlSession.close();

    }

    @Test
    public void queryBlogIF(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap hashMap = new HashMap();
        hashMap.put("title","java如此简单");


        List<Blog> blogs = mapper.queryBlogIF(hashMap);

        for(Blog blog : blogs){
            System.out.println(blog);
        }
    }

    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap hashMap = new HashMap();
        hashMap.put("title","Spring");
        hashMap.put("author","狂神说");

        List<Blog> blogs = mapper.queryBlogChoose(hashMap);

        for(Blog blog : blogs){
            System.out.println(blog);
        }
    }

    @Test
    public void queryBlogSet(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap hashMap = new HashMap();
        hashMap.put("title","微服务");
        hashMap.put("author","狂神说");
        hashMap.put("id","d2d83738dc2d41a398c059dc66423995");

       mapper.updateBlog(hashMap);

        sqlSession.close();
    }

    @Test
    public void queryBlogForEach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        //hashMap.put("title","微服务");
       // hashMap.put("author","狂神说");
       // hashMap.put("id","d2d83738dc2d41a398c059dc66423995");

        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);

        map.put("ids",ids);


        List<Blog> blogs = mapper.queryBlogForeach(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }


}
