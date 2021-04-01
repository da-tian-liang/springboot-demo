package com.example.demo.execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: fl
 * Description: 数据处理
 * Date: 2021/3/23
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 4; i++)
            exec.execute(new Liftoff());
        exec.shutdown();
    }
}
