package org.collectionsLearn.queueDemo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TaskScheduler {
    public static void main(String[] args) {
        // Max-heap based on task priority (higher value = higher priority)
        // custom Comparator
        PriorityQueue<Task> maxHeap = new PriorityQueue<>(
                new Comparator<Task>() {
                    @Override
                    public int compare(Task t1, Task t2) {
                        return Integer.compare(t2.getPriority(),t1.getPriority());
                    }
                }
        );
        maxHeap.offer(new Task("A",10));
        maxHeap.offer(new Task("B",5));
        maxHeap.offer(new Task("C",20));

        while(!maxHeap.isEmpty()){
            System.out.println("Priority Task "+maxHeap.poll());
        }

        // Lambda Expression (Java 8+)
        PriorityQueue<Task> maxHeap2 = new PriorityQueue<>(
                (t1,t2) -> Integer.compare(t2.getPriority(),t1.getPriority())
        );
        maxHeap2.offer(new Task("X",2));
        maxHeap2.offer(new Task("Y",20));
        maxHeap2.offer(new Task("Z",1));
        while (!maxHeap2.isEmpty()){
            System.out.println("Processing "+maxHeap2.poll());
        }
    }
}
