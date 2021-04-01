package com.example.demo.execute;

/**
 * Author: fl
 * Description: 数据处理
 * Date: 2021/3/23
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread(new Liftoff()).start();
        }
        System.out.println("Waiting for Liftoff!");
    }
}
