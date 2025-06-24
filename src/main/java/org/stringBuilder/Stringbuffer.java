package org.stringBuilder;

public class Stringbuffer {
    public static StringBuffer sb = new StringBuffer(" Hello ");
    public static void main(String[] args) {
        System.out.println("String Buffer ");
        Runnable task = () -> {
            for(int i = 0; i < 5 ; i++) {
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
        System.out.println("sb "+sb);

    }
}
