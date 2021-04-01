package com.example.demo.execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Author: fl
 * Description: 数据处理
 * Date: 2021/3/23
 */
public class SleepingTask extends Liftoff {
    public void run() {
        int i = Thread.MAX_PRIORITY;
        try {
            while(countDown-- > 0) {
                System.out.print(status());
                TimeUnit.MILLISECONDS.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 3; i++) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
