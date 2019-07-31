package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author jiangtao
 * @date 2019/7/31 下午9:09.
 */
@SpringBootApplication
@EnableAsync
@ComponentScan(value = {"com.demo"})
public class ApplicationBoot {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApplicationBoot.class);
        application.run(args);
    }
}
