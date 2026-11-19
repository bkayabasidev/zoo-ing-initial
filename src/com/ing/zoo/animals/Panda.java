package com.ing.zoo.animals;

import com.ing.zoo.diets.Herbivore;

public class Panda extends Animal implements Herbivore {
    public Panda(String name)
    {
        super(name);
        helloText = "wubba wubba";
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch nom nom";
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
        trick = "rolls forward";
        System.out.println(trick);
    }
}
