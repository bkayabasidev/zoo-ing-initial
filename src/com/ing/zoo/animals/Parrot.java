package com.ing.zoo.animals;

import com.ing.zoo.diets.Herbivore;

public class Parrot extends Animal implements Herbivore {
    public Parrot(String name)
    {
        super(name);
        helloText = "squawk";
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch squawk";
        System.out.println(eatText);
    }

    @Override
    public boolean canPerformTrick()
    {
        return true;
    }

    @Override
    public void performTrick()
    {
        trick = "speaks";
        System.out.println(trick);
    }
}
