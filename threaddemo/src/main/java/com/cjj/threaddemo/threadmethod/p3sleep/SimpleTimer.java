package com.cjj.threaddemo.threadmethod.p3sleep;

/**
 * 使用线程休眠Thread.sleep完成一个建议的计时器
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/22
 * Time:16:37
 */
public class SimpleTimer {
    public static void main(String[] args) {
        int count = 10;

        if(args.length == 1){
            count = Integer.parseInt(args[0]);
        }

        while (true){
            System.out.println(count);
            count--;
            if(count < 0){
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("计时结束");
    }
}
