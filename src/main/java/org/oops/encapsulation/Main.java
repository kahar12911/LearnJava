package org.oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        System.out.println(encapsulation.getNumber());
        encapsulation.setNumber(10);
        System.out.println(encapsulation.getNumber());
    }
}
