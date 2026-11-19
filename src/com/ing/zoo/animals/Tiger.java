package com.ing.zoo.animals;

import com.ing.zoo.diets.Carnivore;

import java.util.Random;

public class Tiger extends Animal implements Carnivore {
    public Tiger(String name)
    {
        super(name);
        helloText = "rraaarww";
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
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
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
