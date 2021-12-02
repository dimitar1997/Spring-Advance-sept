package com.example.errorhandling.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OrdersController {
    //Here we can see right expose of exception
    @GetMapping("/orders/{id}/details")
    public String showProductDetails(@PathVariable("id") Long id){
        throw new ObjectNotFoundException(id);
    }

}
