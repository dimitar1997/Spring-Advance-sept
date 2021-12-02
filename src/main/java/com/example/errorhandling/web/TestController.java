package com.example.errorhandling.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    //Here we can see bad expose of exception
    @GetMapping("/test")
    public String test(){
        if (true){
            throw new NullPointerException("I did it wrong!");
        }
        return "hello";
    }
}
