package com.example.demo.execute;

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

    public String test() {
        return "完美世界";
    }

    public String test2() {
        return "诛仙";
    }

    public String test3() {
        return "世界";
    }

    public void t1() {
        System.out.println("123");
    }
}
