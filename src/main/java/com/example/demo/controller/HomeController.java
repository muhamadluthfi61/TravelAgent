package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/index.html")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/tables.html")
    public String tables() {
        return "tables";
    }

}