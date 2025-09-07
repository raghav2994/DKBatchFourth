package org.example.javabasics.day3.ConceptOfAbstraction.ConceptofInterface;

public class AutomationwithCatclass implements AnimalInterface{

    @Override
    public void info() {
        System.out.println("This is a cat name 'lilly'.");
    }

    @Override
    public void eat() {
        System.out.println("Lilly is eating fish");
    }

    @Override
    public void sleep() {
        System.out.println("Lilly is sleeping peacefully");
    }

    @Override
    public void move() {
        System.out.println("Lilly is moving on the road");
    }

    @Override
    public void makesound() {
        System.out.println("Lilly is making meow sound");

    }




}
