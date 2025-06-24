package org.oops.polymorphism;

public class MathLibrary {
    public int add(int x, int y){
        System.out.println("Both are Int");
        return x + y;
    }

    public double add(double x , double y){
        System.out.println("Both are Double");
        return x+y;
    }

    public double add(int x, double y){
        System.out.println("x is int and y is double");
        return (double) x + y;
    }

    public double add(double x, int y){
        System.out.println("x is double and y is int");
        return x + (double)y;
    }

    public String add(String x, String y){
        System.out.println("Both are string");
        return x + y;
    }

    public int add(int x, int y, int z){
        System.out.println("params extra");
        return x + y + z;
    }


}
