package org.multithreading.threadpool;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {
    int count = 0;

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(Thread.NORM_PRIORITY);
        t.setName("CustomThread "+count++);
        //t.setDaemon(true);
        return t;
    }
}
