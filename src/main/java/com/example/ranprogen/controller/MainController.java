package com.example.ranprogen.controller;

import com.example.ranprogen.model.Answer;
import com.example.ranprogen.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MainController {
    final MainService mainService;

    @GetMapping("")
    public String main(){
        return "home";
    }

    @ResponseBody
    @GetMapping("/answer")
    public String answer(){
        return mainService.randomAnswer().getCaption();
    }
}
