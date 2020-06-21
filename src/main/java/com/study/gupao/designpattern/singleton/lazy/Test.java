package com.study.gupao.designpattern.singleton.lazy;

/**
 * @program: study-design-pattern
 * @description: 测试懒汉式单例的线程问题
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-21 18:06
 **/
public class Test  {

    public static void main(String[] args) {



        //演示 懒汉式的线程问题
        Thread thread1 = new Thread(new ExectorThread());

        Thread thread2 = new Thread(new ExectorThread());

        thread1.start();
        thread2.start();

        System.out.println("END");


    }
}
