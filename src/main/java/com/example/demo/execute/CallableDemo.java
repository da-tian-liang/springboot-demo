package com.example.demo.execute;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Author: fl
 * Description: 数据处理
 * Date: 2021/3/23
 */
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exc = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            results.add(exc.submit(new TaskWithResult(i)));
        }
        for(Future<String> str : results) {
            try {
                System.out.println(str.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
            } finally {
                exc.shutdown();
            }
        }
    }
}
