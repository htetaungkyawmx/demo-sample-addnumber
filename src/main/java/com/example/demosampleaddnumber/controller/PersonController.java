package com.example.demosampleaddnumber.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersonController {

    /*@GetMapping("/person-info") //uri
    public  String personInfo(@RequestParam("name")String name,
                              @RequestParam("hobby")String hobby,
                              @RequestParam(value = "state",
                                      required = false,
                                      defaultValue = "Myanmar")String state) {
        return String.format("Name is [%s] and Hobby is [%s] and live in [%s]",
                name, hobby, state);
    }*/

    @GetMapping("/person-info") //uri
    public  String personInfo(@RequestParam("name")String name,
                              @RequestParam("hobby")String hobby,
                              @RequestParam Optional<String> state) {
        return String.format("Name is [%s] and Hobby is [%s] and live in [%s]",
                name, hobby, state.orElse("Myanmar"));
    }

    //curl "http://localhost:8080/person-info-v2?name=thaw&hobby=Football"
    @GetMapping("/person-info-v2")
    public String personInfoV2(@RequestParam String name,
                               @RequestParam String hobby) {
        return String.format("Name is [%s] and Hobby is [%s].",
                name, hobby);
    }


    /*@GetMapping({"/person-info/{name}/{hobby}/{state}",
    "person-info/{name}/{hobby}"})
    public String personInvoV3(
            @PathVariable String name,
            @PathVariable String hobby,
            @PathVariable(required = false) String state
    ) {
        return String.format("Name is [%s] and Hobby is [%s] and live in [%s]",
                name, hobby, state);
    }*/

    @GetMapping({"/person-info/{name}/{hobby}/{state}",
            "person-info/{name}/{hobby}"})
    public String personInvoV3(
            @PathVariable String name,
            @PathVariable String hobby,
            @PathVariable Optional <String> state
    ) {
        return String.format("Name is [%s] and Hobby is [%s] and live in [%s]",
                name, hobby, state.orElse("America"));
    }
}
