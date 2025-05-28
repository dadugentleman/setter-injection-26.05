package com.example.today.common;

import org.springframework.stereotype.Component;

@Component

public class MexicanChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Taco taco ola amigos";
    }
    @Override
    public double getSalary() {
        return 1200;
    }
}
