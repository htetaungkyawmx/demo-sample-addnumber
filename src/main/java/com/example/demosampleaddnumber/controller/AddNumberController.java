package com.example.demosampleaddnumber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add-numbers")
public class AddNumberController {
    @GetMapping
    private String addNumber(@RequestParam("num1")int num1,
                             @RequestParam("num2")int num2
    ) {
        return String.format("num1 [%s] and num2 [%s] add equals to [%s]",
                num1, num2, (num1 + num2));
    }

}
