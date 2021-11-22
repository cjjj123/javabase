package com.cjj.threaddemo.createthread.p2;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/9
 * Time:15:24
 */
public class Test {

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main" + i);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
