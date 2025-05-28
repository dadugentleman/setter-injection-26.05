package com.example.today.common;

import org.springframework.stereotype.Component;

@Component

public class MoldovaChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Maliga cu branzaa";
    }

    @Override
    public double getSalary() {
        return 100;
    }
}
