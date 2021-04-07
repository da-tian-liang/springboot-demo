package com.example.demo.execute;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Author: fl
 * Description: 数据处理
 * Date: 2021/3/23
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread thread = new Thread(new Liftoff());
        thread.start();
        System.out.println("waiting for Liftoff!");
    }

    public void t1() {
        System.out.println(11);
        System.out.println("dev分支");
    }
}
