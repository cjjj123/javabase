package com.cjj.threaddemo.createthread.p1;

/**
 *
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/9
 * Time:15:08
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("这是子线程打印的内容");
    }
}
