package com.atguigu.springboot03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping(value = "user")
public class LoginController {

    @PostMapping(value = "login")
    //@RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(String username, String password, Map<String, Object> map){
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            //防止表单重复提交 使用重定向
            //return "dashboard";
            return "redirect:/main.html";
        }else{
            map.put("msg","用户名密码错误");
            return "index";
        }
    }
}
