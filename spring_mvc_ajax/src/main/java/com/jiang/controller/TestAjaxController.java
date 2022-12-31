package com.jiang.controller;

import com.jiang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author jiangronghua
 *
 * 1. @RequestBody: 将请求体中的内容和控制器方法的形参进行绑定
 * 2. 使用@RequestBody注解将json格式的请求参数转换为java对象
 * a> 导入jackson的依赖
 * b> 在SpringMVC配置文件中设置   <mvc:annotation-driven />
 * c> 在处理请求的控制器方法的形参位置， 直接设置json格式的请求参数要转换的java类型的形参 使用@RequestBody标识即可
 * 3. RequestBody: 将所标识的控制器方法的返回值作为响应报文的响应体响应到浏览器
 */
@Controller
public class TestAjaxController {

    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, @RequestBody String requestBody, HttpServletResponse response) throws IOException {
        System.out.println("id" + id);
        System.out.println("requestBody:" + requestBody);
        response.getWriter().write("hello, axios");
    }

    @RequestMapping("/test/RequestBody/json")
    public void testRequestBody(@RequestBody Map<String, Object> map, HttpServletResponse response) throws IOException {
        System.out.println("RequestBody:" + map);
        response.getWriter().write("hello, RequestBody");
    }

    public void testRequestBody(@RequestBody User user, HttpServletResponse response) throws IOException {
        System.out.println("RequestBody:" + user);
        response.getWriter().write("hello, RequestBody");
    }

    @RequestMapping("/test/ResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }
}
