package com.example.basicmvvm.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FruitRepository {

    private  List<String> fruits = Arrays.asList("Apple","Orange","Pineapple","Mango","Muskmelon","Kiwi","Banana","Cherry","Fig");
    public String getRandomFruits() {
        Random r = new Random();
        return fruits.get(r.nextInt(fruits.size()));
    }
}
