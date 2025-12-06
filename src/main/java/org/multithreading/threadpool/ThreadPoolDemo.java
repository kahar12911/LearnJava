package org.multithreading.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

    public void cucurrencyPoolTest(){
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,
                4,
                10,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(),
                new CustomRejectedHandler()
        );
        executor.allowCoreThreadTimeOut(true);

        for (int i = 0 ; i < 7 ; i++){
            executor.submit(() ->
            {
                try {
                    Thread.sleep(5000);
                    System.out.println("Task ,Thread Name : "+Thread.currentThread().getName()+" ,queue size :  "+executor.getQueue().size() +" ,Task Count "+executor.getTaskCount());
                }catch (Exception e){
                        //
                }

            });
        }

        executor.shutdown();

    }
}
