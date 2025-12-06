package org.multithreading.readwrite;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;

    public void produce(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            System.out.println("ReadLock : Produced by thread  : "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);
        }catch(Exception e){

        }finally{
            lock.readLock().unlock();
            System.out.println("ReadLock : Release lock by "+Thread.currentThread().getName());
        }
    }

    public void consume(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println("WriteLock : Consumed by thread : "+Thread.currentThread().getName());
            isAvailable = false;
            Thread.sleep(6000);
        }catch (Exception e){

        }finally {
            lock.writeLock().unlock();
            System.out.println("WriteLock Release lock by : "+Thread.currentThread().getName());
        }
    }
}
