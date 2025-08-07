package org.collectionsLearn.queueDemo;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        maxheap.offer(10);
        maxheap.offer(2);
        maxheap.offer(5);
        System.out.println(maxheap);
    }
}
