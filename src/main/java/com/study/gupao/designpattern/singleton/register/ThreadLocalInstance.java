package com.study.gupao.designpattern.singleton.register;

import com.study.gupao.designpattern.singleton.lazy.ExectorThread;

/**
 * @program: study-design-pattern
 * @description: 线程单例
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-21 20:23
 **/
public class ThreadLocalInstance {


    //线程单例，严格来说，不能完全算是单例，它只能算在单个线程中的单例，也就是在同一个线程中它是单独的
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal =
            new ThreadLocal<ThreadLocalInstance>() {

                @Override
                protected ThreadLocalInstance initialValue() {
                    return new ThreadLocalInstance();
                }
            };

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstanceThreadLocal.get();
    }


    public static void main(String[] args) throws Exception {
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("program end");
    }
}
