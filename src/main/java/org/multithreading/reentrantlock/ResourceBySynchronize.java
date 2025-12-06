package org.multithreading.reentrantlock;

public class ResourceBySynchronize {
    boolean isAvailable = false;

    public synchronized void produce(){
        try{
            System.out.println("Acquired By thread : "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        }catch (Exception e){

        }
        System.out.println("Thread Completed : "+Thread.currentThread().getName());
    }
}
