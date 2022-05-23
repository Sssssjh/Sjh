package com.example.sjh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TakeInController {
    @GetMapping("/ap")
    public String add(){
        return "add";
    }
}
