package com.cjj.threaddemo.threadmethod.p7getid;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/7/3
 * Time:9:33
 */
public class SubThread5 extends  Thread {

    @Override
    public void run() {
        System.out.println("thread name = " + Thread.currentThread().getName() + "id = " + Thread.currentThread().getId());
    }
}
