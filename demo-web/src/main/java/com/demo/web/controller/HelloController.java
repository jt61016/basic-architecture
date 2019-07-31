package com.demo.web.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangtao
 * @date 2019/7/31 下午11:18.
 */
@RestController
@RequestMapping("api/hello/")
@Component
public class HelloController {

    @GetMapping("sayHello")
    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }
}
