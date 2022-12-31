package com.jiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jiangronghua
 */
@Controller
public class TestViewController {

    @RequestMapping("/text/view/thymeleaf")
    public String testThymeleafView() {
        return "success";
    }

    @RequestMapping("/text/view/forward")
    public String testInternalResourceView() {
        return "forward:/test/model";
    }

    @RequestMapping("/text/view/redirect")
    public String testRedirectView() {
        return "redirect:/test/model";
    }
}
