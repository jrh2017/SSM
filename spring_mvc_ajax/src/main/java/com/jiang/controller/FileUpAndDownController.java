package com.jiang.controller;

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

/**
 * @author jiangronghua
 *
 * ResponseEntity: 可以作为控制器方法的返回值， 标识响应到浏览器到完整的响应报文
 *
 * 文件上传的要求：
 * 1. form表单的请求方式必须是post
 * 2. form表单必须设置属性enctype="multipart/form-data"
 */
@Controller
public class FileUpAndDownController {

    @RequestMapping("/test/up")
    public String testUp(MultipartFile photo, HttpSession session) throws IOException {
        // 获取上传的文件的文件名
        String filename = photo.getOriginalFilename();
        // 获取上传的文件的后缀名
        String hzName = filename.substring(filename.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();
        filename = uuid + hzName;
        // 获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        // 获取当前工程下photo目录的真实目录
        String photoPath = servletContext.getRealPath("photo");
        // 创建photoPath所对应的File对象
        File file = new File(photoPath);
        // 判断file对所对应目录是否存在
        if (!file.exists()) {
            file.mkdir();
        }
        String finalPath = photoPath + File.separator + filename;

        // 上传文件
        photo.transferTo(new File(finalPath));
        System.out.println("filename:" + filename);
        return "success";
    }

    @RequestMapping("/test/down")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws
            IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("/static/css/img/body1.jpg");
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename=1.jpg");
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers,statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }
}
