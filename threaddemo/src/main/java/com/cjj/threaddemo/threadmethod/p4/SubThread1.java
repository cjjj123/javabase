package com.cjj.threaddemo.threadmethod.p4;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/9
 * Time:15:55
 */
public class SubThread1 extends Thread {

    public SubThread1() {
        System.out.println(" 构造方法" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println(" 子线程：" + Thread.currentThread().getName());
    }
}
