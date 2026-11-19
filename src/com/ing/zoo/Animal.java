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

    public void performTrick()
    {
        System.out.println("does not know any tricks");
    }
}
