package com.cjj.threaddemo.threadmethod.p11daemon;

/**
 * 守护线程，如垃圾回收器
 * 守护线程不能单独运行，当jvm没有其他用户线程，只有守护线程时，守护线程会自动销毁
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/7/5
 * Time:18:57
 */
public class Test {

    public static void main(String[] args) {
        SubThread subThread = new SubThread();
        // 设置需要在线程启动之前
        subThread.setDaemon(true);
        subThread.start();


        // 当前main线程
        for (int i = 0; i < 10; i++) {
            System.out.println("main == " + i);
        }

        // 当main线程结束了，守护线程thread也销毁了
    }
}
