package com.cjj.threaddemo.createthread.p1;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/9
 * Time:15:10
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("这个是主线程");
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("这个是主线程后面的代码");
    }
}
