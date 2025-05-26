package com.example.today.rest;

import com.example.today.common.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {

    @GetMapping("/dailyrecipe")
    public String dailyRecipe() {
        return myChef.getDailyRecipe();
    }

    private Chef myChef;


    // Constructor
    @Autowired
    public DemoController(@Qualifier("turkishChef") Chef theChef) {
        myChef = theChef;
    }



}
