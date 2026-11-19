package com.ing.zoo.animals;

import com.ing.zoo.diets.Herbivore;

public class Zebra extends Animal implements Herbivore {
    public Zebra(String name)
    {
        super(name);
        helloText = "zebra zebra";
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
