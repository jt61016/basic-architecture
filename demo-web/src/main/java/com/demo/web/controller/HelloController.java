package com.demo.web.controller;

import com.demo.common.dto.Response;
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
    public Response<String> sayHello() {
        System.out.println("hello");
        return Response.ok("hello");
    }
}
