package com.website.orange.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zxl
 * @Description:
 * @date 2020/9/1412:40
 */
@Controller
public class HelloController {


    @GetMapping("/hello")
    public String hello(){
        System.out.println(1231);
        return "hello";
    }
}
