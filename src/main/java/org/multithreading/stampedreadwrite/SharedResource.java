package org.multithreading.stampedreadwrite;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;

    public void produce(StampedLock lock){
        long stamp = lock.readLock();
        try{
            System.out.println("Stamped Read Lock by : "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        }catch (Exception e){

        }finally {
            lock.unlockRead(stamp);
            System.out.println("Release stamped lock by : "+Thread.currentThread().getName());
        }
    }

    public void consume(StampedLock lock){
        long stamp = lock.writeLock();
        try{
            System.out.println("Consume write lock by "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);
        }catch (Exception e){

        }finally {
            lock.unlockWrite(stamp);
            System.out.println("Release write lock by : "+Thread.currentThread().getName());
        }
    }
}
