package com.ing.zoo.animals;

import com.ing.zoo.diets.Carnivore;

public class Lion extends Animal implements Carnivore {
    public Lion(String name)
    {
        super(name);
        helloText = "roooaoaaaaar";
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
