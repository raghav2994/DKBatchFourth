package org.example.javabasics.day3.ConceptOfInhertance;

public class father extends Grandfather{

    public static void diamondOfFather(){

        System.out.println("Diamond purchased by father");
    }
    public static void gold() {
        System.out.println("Gold purchased by father");
    }
    public static void main(String[] args){
        diamondOfFather();
        gold();


    }
}
