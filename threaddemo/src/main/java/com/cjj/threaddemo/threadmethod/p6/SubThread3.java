package com.cjj.threaddemo.threadmethod.p6;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/11
 * Time:19:23
 */
public class SubThread3 extends Thread{

    @Override
    public void run() {
        // 运行状态，返回true
        System.out.println(" run方法： " + this.isAlive());
    }
}
