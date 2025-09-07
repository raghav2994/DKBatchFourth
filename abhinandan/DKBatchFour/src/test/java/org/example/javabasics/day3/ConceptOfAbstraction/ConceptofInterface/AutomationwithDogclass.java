package org.example.javabasics.day3.ConceptOfAbstraction.ConceptofInterface;

public class AutomationwithDogclass implements AnimalInterface{

    @Override
    public void info() {
        System.out.println("This is a Dog named 'Buzzo'.");
    }

    @Override
    public void eat() {
        System.out.println("BUZZO is eating mutton rice.");

    }

    @Override
    public void sleep() {
        System.out.println("Buzzo is sleeping peacefully in his matress.");

    }

    @Override
    public void move() {
        System.out.println("Buzzo gone out for a walk with the owner");
    }

    @Override
    public void makesound() {
        System.out.println("Buzzo is making BooW Boow sound");
    }
}
