package com.example.errorhandling.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    @GetMapping("/products/{id}/details")
    public String showProductDetails(@PathVariable("id") String productId){
        throw new ProductNotFoundException();
    }

    @GetMapping("/products/{id}/error")
    public String bad(@PathVariable("id") String productId){
        throw new NullPointerException();
    }

}
