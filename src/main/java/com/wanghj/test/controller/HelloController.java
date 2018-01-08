package com.wanghj.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这是一个测试控制类
 *
 * @author wanghj
 * @create 2018-01-05 16:12
 **/
@RestController
public class HelloController {

    @GetMapping({"/hello", "/world"})
    public String hello() {
        return "hello world";
    }
}
