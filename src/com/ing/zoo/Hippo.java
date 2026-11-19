package com.ing.zoo;

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
