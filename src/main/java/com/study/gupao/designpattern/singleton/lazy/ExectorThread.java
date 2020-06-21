package com.study.gupao.designpattern.singleton.lazy;

import com.study.gupao.designpattern.singleton.register.EnumSingleton;
import com.study.gupao.designpattern.singleton.register.ThreadLocalInstance;

/**
 * @program: study-design-pattern
 * @description:
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-21 18:09
 **/
public class ExectorThread implements  Runnable{
    @Override
    public void run() {
        ThreadLocalInstance singleton = ThreadLocalInstance.getInstance();

        System.out.println(Thread.currentThread()+"---"+ThreadLocalInstance.getInstance());
        System.out.println(Thread.currentThread()+"---"+ThreadLocalInstance.getInstance());
        System.out.println(Thread.currentThread()+"---"+ThreadLocalInstance.getInstance());
        System.out.println(Thread.currentThread()+"---"+ThreadLocalInstance.getInstance());
        System.out.println(Thread.currentThread()+"---"+ThreadLocalInstance.getInstance());
        System.out.println(Thread.currentThread()+"---"+ThreadLocalInstance.getInstance());
       // System.out.println(Thread.currentThread()+"---"+singleton);
    }
}
