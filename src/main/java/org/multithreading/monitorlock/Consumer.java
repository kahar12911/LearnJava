package org.multithreading.monitorlock;

public class Consumer implements Runnable{
    SharedResources sharedResources;

    Consumer(SharedResources sharedResources){
        this.sharedResources = sharedResources;
    }
    @Override
    public void run() {
        System.out.println("Consumer Thread : "+ Thread.currentThread().getName());
        sharedResources.consumeItem();
    }
}
