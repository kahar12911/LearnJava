package org.stringBuilder;

public class Stringbuffer {
    public static StringBuffer sb = new StringBuffer(" Hello ");
    public static void main(String[] args) throws InterruptedException {
        System.out.println("String Buffer ");
        Runnable task = () -> {
            for(int i = 0; i < 5 ; i++) {
                synchronized (sb) {
                    sb.append(i);
                    System.out.println(sb);
                }
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
        System.out.println("sb "+sb);

    }
}

/**
 *String Buffer
 *  Hello 0
 *  Hello 00
 *  Hello 001
 *  Hello 0012
 *  Hello 00123
 *  Hello 001234
 *  Hello 0012341
 *  Hello 00123412
 *  Hello 001234123
 *  Hello 0012341234
 * sb  Hello 0012341234
 *
 * String Buffer is synchronised , so only one thread access at a time
 * But the print statement are outside synchronised, So output appears mixed
 * Although StringBuffer is thread-safe (synchronized methods), the order of thread execution is not guaranteed. That’s why:
 * The two threads (t1 and t2) are interleaving operations.
 * Thread 1 and Thread 2 are both appending 0, 1, 2, 3, 4 — but not in a strict sequence.
 *
 * StringBuffer ensures thread-safety at the method level, not operation-level atomicity for multiple calls.
 * For ordered/consistent output, you must lock the combined operations (append + println).
 *
 * StringBuffer protects data — not output sequence.
 * Output prints interleave due to unsynchronized System.out.println().
 * join() ensures all appends are done before final print, but doesn’t reorder logs.
 * To make print logs ordered, either synchronize the whole block or defer logging.
 *
 * Even if all operations are synchronized and safe, the output order depends on CPU scheduling, not on Java logic.
 */