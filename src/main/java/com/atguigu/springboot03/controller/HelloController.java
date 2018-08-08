package com.atguigu.springboot03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping(value = "success")
    public String toSuccess(Map<String,Object> map){
        map.put("hello","<h1>hello</h1>");
        map.put("arrays", Arrays.asList("a","b","c"));

        return "success";
    }
}
