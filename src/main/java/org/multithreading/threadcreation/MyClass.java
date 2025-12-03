package org.multithreading.threadcreation;

public class MyClass implements Runnable{
    @Override
    public void run(){
        System.out.println("MyClass : thread name - "+Thread.currentThread().getName());
    }

}
