package com.example.demosampleaddnumber.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/square-numbers")
public class SquareNumberController {

    @GetMapping
    public String squareNumber(
            @RequestParam("num")int num) {
        return String.format("num [%s] square is [%s]",
                num,(num * num));
    }
}
