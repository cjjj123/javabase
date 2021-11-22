package com.cjj.threaddemo.threadmethod.p8yield;

/**
 * 测试yield礼让
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/7/3
 * Time:9:41
 */
public class Test {

    public static void main(String[] args) {
        SubThread6 subThread6 = new SubThread6();
        subThread6.start();

        long begin = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("main 用时：" + (end - begin));
    }
}
