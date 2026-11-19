package com.ing.zoo.animals;

import com.ing.zoo.diets.Herbivore;

public class Hippo extends Animal implements Herbivore {
    public Hippo(String name)
    {
        super(name);
        helloText = "splash";
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
