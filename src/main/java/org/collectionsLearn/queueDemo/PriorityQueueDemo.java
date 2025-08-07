package org.collectionsLearn.queueDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.offer(10);
        heap.offer(2);
        heap.offer(5);
        System.out.println(heap);
    }
}
