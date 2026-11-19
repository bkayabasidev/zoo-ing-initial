package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("henk"));
        animals.add(new Hippo("elsa"));
        animals.add(new Pig("dora"));
        animals.add(new Tiger("wally"));
        animals.add(new Zebra("marty"));

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Voer uw command in: ");

            if (!scanner.hasNextLine())
            {
                break;
            }
            String input = scanner.nextLine().trim();

            if (input.equals("exit") || input.equals("quit"))
            {
                break;
            }

            if (input.equals("help"))
            {
                System.out.println("Available commands:");
                for (String c : commands)
                {
                    System.out.println("  " + c + " [name]");
                }
                System.out.println("  help");
                System.out.println("  exit");
                System.out.println("Animals:");
                for (Animal animal : animals)
                {
                    String diet;
                    if (animal instanceof Omnivore)
                    {
                        diet = "omnivore";
                    }
                    else if (animal instanceof Carnivore)
                    {
                        diet = "carnivore";
                    }
                    else
                    {
                        diet = "herbivore";
                    }
                    System.out.println("  " + animal.name + " (" + animal.getClass().getSimpleName() + ", " + diet + ")");
                }
                continue;
            }

            // Split the input into the command and an optional animal name.
            String command = null;
            String name = null;
            for (String c : commands)
            {
                if (input.equals(c))
                {
                    command = c;
                    break;
                }
                if (input.startsWith(c + " "))
                {
                    command = c;
                    name = input.substring(c.length() + 1).trim();
                    break;
                }
            }

            if (command == null)
            {
                System.out.println("Unknown command: " + input);
                continue;
            }

            // Pick the targets: one named animal, or every animal.
            List<Animal> targets = new ArrayList<>();
            if (name == null)
            {
                targets.addAll(animals);
            }
            else
            {
                for (Animal animal : animals)
                {
                    if (animal.name.equals(name))
                    {
                        targets.add(animal);
                    }
                }
                if (targets.isEmpty())
                {
                    System.out.println("Unknown animal: " + name);
                    continue;
                }
            }

            for (Animal animal : targets)
            {
                if (command.equals(commands[0]))
                {
                    System.out.print(animal.name + ": ");
                    animal.sayHello();
                }
                else if (command.equals(commands[1]))
                {
                    if (animal instanceof Herbivore)
                    {
                        System.out.print(animal.name + ": ");
                        ((Herbivore) animal).eatLeaves();
                    }
                    else if (name != null)
                    {
                        System.out.println(animal.name + " does not eat leaves");
                    }
                }
                else if (command.equals(commands[2]))
                {
                    if (animal instanceof Carnivore)
                    {
                        System.out.print(animal.name + ": ");
                        ((Carnivore) animal).eatMeat();
                    }
                    else if (name != null)
                    {
                        System.out.println(animal.name + " does not eat meat");
                    }
                }
                else if (command.equals(commands[3]))
                {
                    if (animal.canPerformTrick())
                    {
                        System.out.print(animal.name + ": ");
                        animal.performTrick();
                    }
                    else if (name != null)
                    {
                        System.out.println(animal.name + " does not know any tricks");
                    }
                }
            }
        }

        scanner.close();
    }
}
