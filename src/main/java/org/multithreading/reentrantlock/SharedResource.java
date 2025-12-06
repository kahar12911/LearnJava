package org.multithreading.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;
    //ReentrantLock lock = new ReentrantLock();

    public void produce(ReentrantLock lock){
        try{
            lock.lock();
            System.out.println("Aquired by lock : "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);
        }catch (Exception e){
            //
        }
        finally{
            lock.unlock();
            System.out.println("Release lock by : "+Thread.currentThread().getName());
        }
    }
}
