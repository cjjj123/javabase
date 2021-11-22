package com.cjj.threaddemo.threadmethod.p8yield;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/7/3
 * Time:9:41
 */
public class SubThread6 extends Thread {

    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
            // 线程让步，放弃CPU执行权
            Thread.yield();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时：" + (end - begin));
    }
}
