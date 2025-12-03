package org.multithreading.monitorlock;

public class Producer implements Runnable{
    SharedResources sharedResources;

    Producer(SharedResources sharedResources){
        this.sharedResources = sharedResources;
    }

    @Override
    public void run() {
        System.out.println("Producer Thread : "+Thread.currentThread().getName());
        try{
            Thread.sleep(5000l);
        }catch (Exception e){}
        sharedResources.addItem();
    }
}
