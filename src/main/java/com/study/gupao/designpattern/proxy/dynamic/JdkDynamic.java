package com.study.gupao.designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: study-design-pattern
 * @description: JDK 方式的动态代理
 * @author: Mike
 * @create: 2020-06-27 23:10
 **/
public class JdkDynamic implements InvocationHandler {

    private Object target;

    public JdkDynamic(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        beforeTime();
        Object result = method.invoke(target, args);
        afterTime();
        return result;
    }

    public void beforeTime() {
        System.out.println("买房前--->好好赚钱，积累经验，跳槽涨薪");
    }

    public void afterTime() {
        System.out.println("买房后---> 和爱的人一起住在精心装修的小窝");
    }

}
