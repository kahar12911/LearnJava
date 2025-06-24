package org.stringBuilder;

public class StringBuilderThread {
    static StringBuilder sb = new StringBuilder("Hello ");

    public static void main(String[] args) throws InterruptedException {
        System.out.println("String Builder ");
        Runnable task = () -> {
            for(int i = 0 ; i < 5; i++){
                sb.append(i);
                System.out.println(sb);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
//        t1.run();
//        t2.run();
        t1.join();
        t2.join();
        System.out.println("sb " +sb);
    }
}

/**
 * String Builder
 * Hello 0
 * Hello 01
 * Hello 012
 * Hello 0123
 * Hello 01230
 * Hello 012301
 * Hello 0123012
 * Hello 01230123
 * Hello 0123012344
 * Hello 0123012344
 * sb Hello 0123012344
 */
