package com.study.gupao.designpattern.singleton.lazy;

/**
 * @program: study-design-pattern
 * @description: 懒汉式单例
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-21 11:03
 **/
public class LazySimpleSingleton {


    //普通懒汉式单例，在多线程情况下是非安全性的
    private static LazySimpleSingleton singleton;

    private LazySimpleSingleton() {

    }

    public static LazySimpleSingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazySimpleSingleton();
            return singleton;
        } else {
            return singleton;
        }
    }

}
