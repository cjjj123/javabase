package com.cjj.threaddemo.createthread.p3;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/9
 * Time:15:43
 */
public class Test {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunable());
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main " + i);
        }


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("sub " + i);
                }
            }
        });
        thread1.start();
    }
}
