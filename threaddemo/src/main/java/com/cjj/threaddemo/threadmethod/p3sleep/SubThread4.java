package com.cjj.threaddemo.threadmethod.p3sleep;

/**
 *子线程休眠
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2021/6/22
 * Time:16:07
 */
public class SubThread4 extends  Thread{

    @Override
    public void run() {
        System.out.println("run,threadname = " + Thread.currentThread().getName() + " , begin = " + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
            System.out.println("run,threadname = " + Thread.currentThread().getName() + " , end = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            // 在子线程的run方法中，如果有异常处理，只能选择捕获处理，不能抛出处理
            e.printStackTrace();
        }
    }
}
