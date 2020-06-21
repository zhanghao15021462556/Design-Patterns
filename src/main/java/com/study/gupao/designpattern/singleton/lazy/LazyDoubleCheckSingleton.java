package com.study.gupao.designpattern.singleton.lazy;

/**
 * @program: study-design-pattern
 * @description: 懒汉式 双重锁模式实现单例   （可通过 反射和 序列化 破坏单例）
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-21 18:16
 **/
public class LazyDoubleCheckSingleton {

    //静态变量记录唯一实例，   volatile 关键字确保，当变量被初始化成实例时，多个线程正确的可预见性
    private volatile static LazyDoubleCheckSingleton singleton;

    private LazyDoubleCheckSingleton() {

        if (null != singleton) {
            throw new RuntimeException("不可被多次实例化");
        }
    }

    public static LazyDoubleCheckSingleton getSingleton() {

        if (singleton == null) {
            //class 类锁
            synchronized (LazyDoubleCheckSingleton.class) { //同步代码块

                if (singleton == null) { //必须在校验一次，不然会出现多个线程在等待锁的时候，不知道这个类已经被实例化
                    singleton = new LazyDoubleCheckSingleton();
                }
            }

        }
        return singleton;

    }
}
