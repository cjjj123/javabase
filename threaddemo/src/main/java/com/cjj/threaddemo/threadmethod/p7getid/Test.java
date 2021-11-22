package com.cjj.threaddemo.threadmethod.p7getid;

/**
 * 获取线程id
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/22
 * Time:16:49
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("main name = " + Thread.currentThread().getName() + "id = " + Thread.currentThread().getId());
        // 子线程的id
        for (int i = 0; i < 5; i++) {
            SubThread5 subThread5 = new SubThread5();
            subThread5.start();
            try {
                // 休眠的目的，展示某个线程的运行结束后，该编号会被后续创建的线程获取
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
