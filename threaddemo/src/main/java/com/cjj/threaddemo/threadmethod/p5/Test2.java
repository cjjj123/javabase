package com.cjj.threaddemo.threadmethod.p5;

/**
 * 测试现在名称，判断当前线程归属
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/11
 * Time:19:04
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        SubThread2 t2 = new SubThread2();
        // 设置线程名称
        t2.setName("t2");
        t2.start();

        // main线程睡眠500毫秒，t2
        Thread.sleep(500);

        Thread t3 = new Thread(t2);
        t3.start();

    }
}
