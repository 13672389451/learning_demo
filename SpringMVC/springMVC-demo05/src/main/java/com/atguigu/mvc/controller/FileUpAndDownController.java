package com.atguigu.mvc.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Controller
public class FileUpAndDownController {

    @RequestMapping("/testDown")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException {
        //��ȡServletContext����
        ServletContext servletContext = session.getServletContext();
        //��ȡ���������ļ�����ʵ·��
        String realPath = servletContext.getRealPath("/static/img/1.jpg");
        // ����������
        InputStream is = new FileInputStream(realPath);
        // �����ֽ�����
        byte[] bytes = new byte[is.available()];
        // ���������ֽ�������
        is.read(bytes);
        // ����HttpHeaders����������Ӧͷ��Ϣ
        MultiValueMap<String, String> headers = new HttpHeaders();
        // ����Ҫ���ط�ʽ�Լ������ļ�������
        headers.add("Content-Disposition", "attachment;filename=1.jpg");
        // ������Ӧ״̬��
        HttpStatus statusCode = HttpStatus.OK;
        // ����ResponseEntity����
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        // �ر�������
        is.close(); return responseEntity;
    }

    @RequestMapping("/testUp")
    public String testUp(MultipartFile photo ,HttpSession session) throws IOException {
        //��ȡ�ϴ����ļ���
         String fileName = photo.getOriginalFilename();

         //��ȡ�ϴ����ļ��ĺ�׺��
        String suffixName = fileName.substring(fileName.lastIndexOf("."));

        //��uuid��Ϊ�ļ���
        String uuid = UUID.randomUUID().toString();

        fileName =uuid+suffixName;

        //��ȡ�������е�photo Ŀ¼·��
         ServletContext servletContext = session.getServletContext();
         String photoPath = servletContext.getRealPath("photo");
         File file = new File(photoPath);

         if(! file.exists()){
             //������ ����Ŀ¼
             file.mkdir();
         }
         String finalPath = photoPath + File.separator + fileName;
         photo.transferTo(new File(finalPath));


        return "success";
    }



}
