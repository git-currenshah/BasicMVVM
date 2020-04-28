package com.example.basicmvvm;

import com.example.basicmvvm.repository.FruitRepository;

public class MainActivityModel {

    FruitRepository fruitRepository = new FruitRepository();

    String getRandomFruits() {
        return fruitRepository.getRandomFruits();
    }
}
