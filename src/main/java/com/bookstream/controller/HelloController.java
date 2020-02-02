package com.bookstream.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: bookstream
 * @description
 * @author: JayChen
 * @create: 2020-02-01 22:47
 **/

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World! code is shit!";
    }
}
