package org.multithreading.monitorlock;

public class SharedResources {
    boolean itemAvailable = false;

    public synchronized void addItem(){
        itemAvailable = true;
        System.out.println("Item has been Added Successfully by "+Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Item has been consumed By "+Thread.currentThread().getName());

        while(!itemAvailable){
            try{
                System.out.println("Waiting Thread : "+Thread.currentThread().getName());
                wait();
            }catch (Exception e){}
        }
        System.out.println("Item consumed By "+ Thread.currentThread().getName());
        itemAvailable = false;
    }
}
