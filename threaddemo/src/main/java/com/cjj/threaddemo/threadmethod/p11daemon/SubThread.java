package com.cjj.threaddemo.threadmethod.p11daemon;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/7/5
 * Time:18:59
 */
public class SubThread extends Thread {

    @Override
    public void run() {
        while (true){
            System.out.println("subThread......");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
