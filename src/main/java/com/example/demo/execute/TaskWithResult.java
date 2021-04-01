package com.example.demo.execute;

import java.util.concurrent.Callable;

/**
 * Author: fl
 * Description: 数据处理
 * Date: 2021/3/23
 */
public class TaskWithResult implements Callable<String> {

    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() {
        return "result of TaskWithResult " + id;
    }
}
