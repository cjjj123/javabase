package com.cjj.threaddemo.threadmethod.p10interrupt;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/7/5
 * Time:18:48
 */
public class SubThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("sub thread -- > " + i );
        }
    }
}
