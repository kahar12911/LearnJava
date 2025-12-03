package org.multithreading.monitorlock;

public class Main {
    public static void main(String[] args) {
        Thread producer = new Thread(new Producer(new SharedResources()));
        Thread consumer = new Thread(new Consumer(new SharedResources()));

        producer.start();
        consumer.start();
    }
}
