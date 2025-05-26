package com.example.today.rest;

import util.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {

    @GetMapping("/dailyrecipe")
    public String dailyRecipe() {
        return myChef.getDailyRecipe();
    }

    private Chef myChef;

    //Constructor

    @Autowired
    public DemoController(Chef theChef) {
        myChef = theChef;
    }
}
