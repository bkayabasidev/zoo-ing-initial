package com.ing.zoo;

public abstract class Animal {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Animal(String name)
    {
        this.name = name;
    }

    public void sayHello()
    {
        System.out.println(helloText);
    }

    public boolean canPerformTrick()
    {
        return false;
    }

    public void performTrick()
    {
    }
}
