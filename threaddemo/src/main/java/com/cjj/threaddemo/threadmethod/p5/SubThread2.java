package com.cjj.threaddemo.threadmethod.p5;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/9
 * Time:16:06
 */
public class SubThread2 extends Thread{

    public SubThread2() {
        System.out.println(" 构造方法中 Thread： " + Thread.currentThread().getName());

        System.out.println( " 构造方法中 : " + this.getName());
    }

    @Override
    public void run() {
        System.out.println(" run方法中 Thread： " + Thread.currentThread().getName());

        System.out.println( " run方法中 : " + this.getName());
    }

}
