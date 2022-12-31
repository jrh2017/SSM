package com.jiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author jiangronghua
 */

/**
 * params 可以使用四种表达式
 * "param": 表示当前匹配请求的请求参数中必须携带param参数
 * "!param": 表示当前匹配请求的请求参数中一定不能携带param参数
 * "param=value": 表示当前匹配请求的请求参数中必须携带param参数且参数为value
 * "param!=value": 表示当前匹配请求的请求参数中可以不携带param参数， 若携带值一定不能是value
 */
@Controller
// @RequestMapping("/test")
public class TestRequestMapperingController {

    @RequestMapping(
            value = {"/hello", "/abc"},
            method = {RequestMethod.POST, RequestMethod.GET},
            // params = {"username", "!password", "age=20", "gender!=女"}
            headers = {"referer"}
    )
    public String hello() {
        return "success";
    }

    @RequestMapping("/a?a/test/ant")
    public String testAnt() {
        return "success";
    }

    @RequestMapping("/test/rest/{id}")
    public String testRest(@PathVariable("id") Integer id) {
        System.out.println("id:" + id);
        return "success";
    }
}
