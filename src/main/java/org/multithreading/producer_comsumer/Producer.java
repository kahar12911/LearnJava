//package org.multithreading.producer_comsumer;
//
//public class Producer {
//
//    public String produceData(SharedQueue queue, int data){
//        if(((queue.front+1) == queue.queuesize && queue.rear == -1)) || (queue.front+1==queue.rear){
//            return "Queue is FUll";
//        }
//        queue.front = (queue.front+1)% queue.queuesize;
//        return "Produce data at "+queue.front+" "+ queue.queue.offer(data);
//    }
//}
