package com.cbond.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HelloController {


    @RequestMapping(value = "/")
    public String sayHello() {
        return "hello";
    }

    public static void main(String[] args) {

    }
}

