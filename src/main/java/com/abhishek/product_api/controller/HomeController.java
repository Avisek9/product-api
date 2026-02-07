package com.abhishek.product_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Product API is running. Visit https://product-api-w0rr.onrender.com/swagger-ui/index.html";
    }
}
