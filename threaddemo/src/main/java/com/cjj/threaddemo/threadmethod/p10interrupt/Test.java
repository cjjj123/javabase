package com.cjj.threaddemo.threadmethod.p10interrupt;

/**
 * 中断线程
 * 仅仅是在当前线程打一个停止标志，并不是真正的停止线程
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/7/5
 * Time:18:47
 */
public class Test {
    public static void main(String[] args) {
        SubThread2 subThread = new SubThread2();
        subThread.start();

        // 当前线程
        for (int i = 0; i < 100; i++) {
            System.out.println("main -- > " + i);
        }

        // 中断子线程 仅仅是给子线程标志中断，没有真正的中断
        subThread.interrupt();
    }
}
