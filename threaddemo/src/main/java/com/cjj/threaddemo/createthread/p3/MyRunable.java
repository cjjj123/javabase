package com.cjj.threaddemo.createthread.p3;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/9
 * Time:15:42
 */
public class MyRunable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("sub thread " + i);
        }
    }
}
