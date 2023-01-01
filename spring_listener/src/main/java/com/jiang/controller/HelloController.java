package com.jiang.controller;

import com.jiang.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author jiangronghua
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;
}
