package org.multithreading.threadcreation;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Thread t = new Thread(myClass);
    }
}
