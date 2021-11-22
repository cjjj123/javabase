package com.cjj.threaddemo.threadmethod.p6;

/**
 * 测试线程的活动状态
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/11
 * Time:19:25
 */
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        SubThread3 t3 = new SubThread3();
        System.out.println(" begin== " + t3.isAlive());
        t3.start();
        Thread.sleep(1000);
        // 判断T3线程的运行情况
        System.out.println(" end== " + t3.isAlive());
    }
}
