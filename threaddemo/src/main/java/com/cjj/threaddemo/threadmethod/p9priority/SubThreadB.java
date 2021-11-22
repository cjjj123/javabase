package com.cjj.threaddemo.threadmethod.p9priority;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/7/3
 * Time:10:21
 */
public class SubThreadB extends Thread {

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("B用时：" + (end- start) );
    }
}
