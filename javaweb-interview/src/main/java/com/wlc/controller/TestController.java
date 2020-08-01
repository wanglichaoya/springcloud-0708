package com.wlc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王立朝
 * @date 2020-7-16
 * @description:
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "hello world";
    }
}
