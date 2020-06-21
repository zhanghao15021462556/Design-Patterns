package com.study.gupao.designpattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: study-design-pattern
 * @description: 容器单例（Spring 中的实现方式）
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-21 19:29
 **/
public class ContainerSingleton {

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    private ContainerSingleton() {
    }

    public static Object getBean(String className) {


        //synchronized（非this）代码块中程序与同步方法是异步的，
        // 不与其他锁this同步方法争夺this锁，可以提高执行效率

        synchronized (ioc) { //性能上会优越于类锁
            if (!ioc.containsKey(className)) {
                Object o = null;

                try {
                    o = Class.forName(className).newInstance();
                    ioc.put(className, o);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return o;
            } else {
                return ioc.get(className);
            }
        }
    }
}
