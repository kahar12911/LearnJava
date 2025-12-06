package org.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {
    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);

    public void produce(){
        try{
            lock.acquire();
            System.out.println("Acquired lock by : "+Thread.currentThread().getName());
            isAvailable = false;
            Thread.sleep(4000);
        }catch (Exception e){

        }finally {
            System.out.println("Release lock by : "+Thread.currentThread().getName());
            lock.release();
        }
    }

}
