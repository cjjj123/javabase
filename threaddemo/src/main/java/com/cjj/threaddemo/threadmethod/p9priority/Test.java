package com.cjj.threaddemo.threadmethod.p9priority;

/**
 * 测试线程优先级
 * 数字越大，优先级越高 1~10
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/7/3
 * Time:10:21
 */
public class Test {

    public static void main(String[] args) {
        SubThreadA  subThreadA = new SubThreadA();
        subThreadA.setPriority(1);
        subThreadA.start();

        SubThreadB subThreadB = new SubThreadB();
        subThreadB.setPriority(10);
        subThreadB.start();
    }
}
