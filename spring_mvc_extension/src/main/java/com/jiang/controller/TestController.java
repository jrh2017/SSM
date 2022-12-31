package com.jiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jiangronghua
 */
@Controller
public class TestController {

    @RequestMapping("/test/hello")
    public String testHello() {
        return "success";
    }
}
