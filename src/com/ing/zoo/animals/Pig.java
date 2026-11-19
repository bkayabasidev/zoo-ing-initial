package com.ing.zoo.animals;

import com.ing.zoo.diets.Omnivore;

import java.util.Random;

public class Pig extends Animal implements Omnivore {
    public Pig(String name)
    {
        super(name);
        helloText = "splash";
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
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
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
