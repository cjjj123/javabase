package com.cjj.threaddemo.threadmethod.p10interrupt;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/7/5
 * Time:18:48
 */
public class SubThread2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // 判断线程的中断标志,返回线程的中断标志
            if(this.isInterrupted()){
                System.out.println("当前线程的中断标志为true，我要退出了");
                break;
            }
            System.out.println("sub thread -- > " + i );
        }
    }
}
