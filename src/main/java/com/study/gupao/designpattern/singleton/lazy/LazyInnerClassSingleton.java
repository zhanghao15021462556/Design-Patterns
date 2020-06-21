package com.study.gupao.designpattern.singleton.lazy;

/**
 * @program: study-design-pattern
 * @description: 静态内部类 实现单例
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-21 18:30
 **/
public class LazyInnerClassSingleton {


    // 原理： 外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存
    //  当getInstance()方法被调用时，LazyHoder才在 LazyInnerClassSingleton 的运行时常量池里，
    //  把符号引用替换为直接引用，这时静态对象singleton也真正被创建

    //可以看出INSTANCE在创建过程中是线程安全的，所以说静态内部类形式的单例可保证线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化。
    private LazyInnerClassSingleton() {
    }

    private static class LazyHoder {
        private static final LazyInnerClassSingleton singleton = new LazyInnerClassSingleton();
    }

    //只有当外部调用  getSingleton方法时，内部类才会被真正加载到内存中，而作为static修饰的变量会被放在外部类的常量池中，
    public  static  LazyInnerClassSingleton getSingleton(){
        return  LazyHoder.singleton;
    }
}
