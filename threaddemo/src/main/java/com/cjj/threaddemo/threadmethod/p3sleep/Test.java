package com.cjj.threaddemo.threadmethod.p3sleep;

/**
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/22
 * Time:16:06
 */
public class Test {
    public static void main(String[] args) {
        SubThread4 t4 = new SubThread4();
        System.out.println("main_begin = " + System.currentTimeMillis());
        //t4.start();
        t4.run();
        System.out.println("end_begin = " + System.currentTimeMillis());
    }
}
