package com.example.demo.execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: fl
 * Description: 数据处理
 * Date: 2021/3/23
 */
public class SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 3; i++)
            exec.execute(new Liftoff());
        exec.shutdown();
    }
}
