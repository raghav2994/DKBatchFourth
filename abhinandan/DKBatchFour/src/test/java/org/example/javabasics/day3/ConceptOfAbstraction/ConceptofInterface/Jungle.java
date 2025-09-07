package org.example.javabasics.day3.ConceptOfAbstraction.ConceptofInterface;

public class Jungle {
    public static void main(String[] args)
    {
        AnimalInterface a=new AutomationwithDogclass();
        AnimalInterface b=new PuppyClass();

        AutomationwithCatclass d= new KittenClass();



       a.makesound();
       b.makesound();
       d.makesound();
       a.sleep();
       b.move();
       d.move();

    }
}
