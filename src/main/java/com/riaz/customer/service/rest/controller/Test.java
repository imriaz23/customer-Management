package com.riaz.customer.service.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("/")
    public String send(){
        return "hi Weilcome to digital banking";
    }
}
