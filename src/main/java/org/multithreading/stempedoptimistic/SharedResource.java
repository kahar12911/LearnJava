package org.multithreading.stempedoptimistic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    int shared = 10;
    StampedLock lock = new StampedLock();

    public void produce(){
        long stamp = lock.tryOptimisticRead();
        // lock.tryOptimisticRead(); is not a actually lock. stamp store some reference while read
        try{
            System.out.println("Producer Optimistic read lock by : " +Thread.currentThread().getName());
            shared = 11;
            Thread.sleep(8000);
            if(lock.validate(stamp)){
                System.out.println("Successfully updated value");
            }
            else{
                System.out.println("ROLLBACK of value ");
                shared=10;
            }
        }catch (Exception e){

        }
    }

    public void consume() {
        long stamp = lock.writeLock();
        try {
            System.out.println("Consumer write lock by " + Thread.currentThread().getName());
            shared = 9;
            //Thread.sleep(10000);
        } finally {
            lock.unlockWrite(stamp);
            System.out.println("Release consumer lock by " + Thread.currentThread().getName());
        }
    }
}
