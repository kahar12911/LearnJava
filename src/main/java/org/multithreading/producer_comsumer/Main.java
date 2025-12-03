package org.multithreading.producer_comsumer;

public class Main {
    public static void main(String[] args)  {
        SharedQueue queue = new SharedQueue(5);

        Thread produce = new Thread(() ->
        {
            try {
                for(int i=0;i<=6;i++)
                {
                    queue.produce(i);
                }
            } catch (Exception e) {
                //throw new RuntimeException(e);
            }
        });
        Thread consume = new Thread(() ->
        {
            try {
                for (int i = 0; i <= 6; i++) {
                    int x = queue.consume();
                }
            } catch (Exception e) {
                //throw new RuntimeException(e);
            }
        });

        consume.start();
        produce.start();


    }
}
