package org.multithreading.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void produce(){
        try{
            lock.lock();
            System.out.println("Producer Acquired the lock by "+Thread.currentThread().getName());
            if(isAvailable){
                // already available, producer has to wait till it consumed
                System.out.println("Producer thread waiting "+Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = true;
            condition.signal();
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("Producer thread release by "+Thread.currentThread().getName());
        }
    }

    public void consume(){
        try{
            lock.lock();
            System.out.println("Consumer lock acquired by "+Thread.currentThread().getName());
            if(!isAvailable){
                // not available, wait till producer produces
                System.out.println("Consumer thread waiting :  "+Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = false;
            condition.signal();
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("Consumer lock released by "+Thread.currentThread().getName());
        }
    }

}
