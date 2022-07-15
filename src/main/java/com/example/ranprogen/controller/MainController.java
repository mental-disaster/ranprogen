package com.example.ranprogen.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MainController {

    @GetMapping("")
    public String main(){
        return "home";
    }

    @ResponseBody
    @GetMapping("/test")
    public String test(){
        return "숨셔";
    }
}
