package com.cjj.threaddemo.createthread.p2;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/9
 * Time:15:25
 */
public class MyThread2 extends Thread{


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("sub thread" + i);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
