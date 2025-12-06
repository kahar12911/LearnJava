package org.multithreading.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class MainSync {
    public static void main(String[] args) {
//        ResourceBySynchronize synchronize1 = new ResourceBySynchronize();
//        Thread t1 = new Thread(() ->
//            synchronize1.produce()
//        );
//
//        ResourceBySynchronize synchronize2 = new ResourceBySynchronize();
//        Thread t2 = new Thread(() ->
//                synchronize2.produce()
//        );
//
//        t1.start();
//        t2.start();

        ReentrantLock lock = new ReentrantLock();
        SharedResource resource1 = new SharedResource();
        Thread t3 = new Thread(() ->
                resource1.produce(lock)
        );
        SharedResource resource2 = new SharedResource();
        Thread t4 = new Thread(() ->
                resource2.produce(lock)
        );

        t3.start();
        t4.start();
    }
}
