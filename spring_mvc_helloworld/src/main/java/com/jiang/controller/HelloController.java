package com.jiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * @author jiangronghua
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String protal() {
        // 将逻辑视图返回
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
