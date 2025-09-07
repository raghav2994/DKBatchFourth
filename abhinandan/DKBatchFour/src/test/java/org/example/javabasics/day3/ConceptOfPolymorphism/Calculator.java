package org.example.javabasics.day3.ConceptOfPolymorphism;
//....Method Overloading....
public class Calculator {
    public static int addition(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
    public static int addition(int a,int b,int c)
    {
        int sum=a+b+c;
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(addition(2,3,4));
    }
}
