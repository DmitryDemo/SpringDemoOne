package com.spring.demo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

    private String[] fortunes = {"Fortune One",
            "Fortune Two",
            "Fortune Three"};

    private Random rnd = new Random();

    public String getFortune() {
        int rndIndex = rnd.nextInt(fortunes.length);
        return fortunes[rndIndex];
    }
}
