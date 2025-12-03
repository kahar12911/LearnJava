//package org.multithreading.producer_comsumer;
//
//public class Consumer {
//
//    public String consumeData(SharedQueue queue){
//        if(queue.front == queue.rear ){
//            queue.front = -1;
//            queue.rear = -1;
//            return "Queue is Empty";
//        }
//        queue.rear = (queue.rear+1) % queue.queuesize;
//        return "Consumed Data at"+queue.rear+" : "+queue.queue.poll();
//    }
//}
