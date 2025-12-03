package org.multithreading.producer_comsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {
    int queuesize;
    Queue<Integer> queue;


    SharedQueue(int size){
        this.queuesize = size;
        queue = new LinkedList<>();
    }

    public synchronized void produce(int item) throws Exception{
        while(queue.size() == queuesize){
            System.out.println("Queue is full, Waiting to consume item");
            wait();
        }
        queue.offer(item);
        System.out.println("Produced item "+item+" , Notifying to consumer ");
        notify();
    }

     public synchronized int consume() throws Exception{
        while(queue.isEmpty()){
            System.out.println("Queue is Empty, Waiting to prduce item");
            wait();
        }
        int x = queue.poll();
        System.out.println("Consumed item : "+x+" , Notifying to producer");
        return x;
    }


}
