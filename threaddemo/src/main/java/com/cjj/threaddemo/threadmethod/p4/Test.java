package com.cjj.threaddemo.threadmethod.p4;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/9
 * Time:15:57
 */
public class Test {

    public static void main(String[] args) {

        SubThread1 subThread1 = new SubThread1();
        subThread1.start();
        // 在main方法中调用run()方法，没有开启新的子线程
        subThread1.run();

        System.out.println(" main " + Thread.currentThread().getName());

    }
}
