package com.ing.zoo;

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
