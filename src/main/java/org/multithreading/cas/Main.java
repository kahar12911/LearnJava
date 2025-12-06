package org.multithreading.cas;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        //resource.increment();

        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i < 5; i++)
                resource.increment();
        });

        Thread t2 = new Thread(() ->
        {
            for (int i = 0; i < 5; i++)
                resource.increment();
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(resource.getCounter());


    }
}
