package org.multithreading.cas;

public class MainSimple {
    public static void main(String[] args) {
        SharedResourceSimple resource = new SharedResourceSimple();
//        for (int i = 0 ; i < 200 ; i++){
//            resource.increment();
//        }
//        System.out.println(resource.getCount());

        Thread t1 = new Thread(() -> {
            for(int i = 0 ; i < 200 ; i++ ){
                resource.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0 ; i < 200 ; i++ ){
                resource.increment();
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Count value : "+resource.getCount());


    }
}
