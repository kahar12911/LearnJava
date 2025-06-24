package org.oops.polymorphism;

public class OverRide extends MathLibrary {
    public static void main(String[] args) {
        MathLibrary library = new OverRide();
        System.out.println(library.add(5,8));
        System.out.println(library.add(5,8.7));
        System.out.println(library.add(4.5,8));
        System.out.println(library.add(5.9,8.5));
        System.out.println(library.add("Deepika ","kahar"));
        System.out.println(library.add(5,8,66));

        OverRide overRide = new OverRide();
        System.out.println(overRide.add(4,9));
        System.out.println(overRide.add("Hello ","Deepika"));
    }
}
