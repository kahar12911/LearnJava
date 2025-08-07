package org.final_static_transient_volatile;

import java.util.Map;
import java.util.TreeMap;

public class VolatileExample extends  Thread{
    volatile boolean running = true;
    // volatile ensures visibility:
    //When one thread modifies a volatile variable, all other threads immediately see the updated value.
    int count = 0;

    public void run() {
        System.out.println("Thread Started");
        while (running) {
            System.out.println("In Running");
            count++;
        }
        System.out.println("Thread Stopped");
    }
    public void stopRunning(){
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();
        example.start();

        Thread.sleep(10000);
        example.stopRunning();
        System.out.println(example.count);


    }
}







