package com.study.gupao.designpattern.proxy.dynamic;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: study-design-pattern
 * @description: Cglib 实现动态代理（基于任何类都可以）
 * @author: Mike
 * @create: 2020-06-27 23:24
 *
 *
 * 总结： CGLIB创建的动态代理对象比JDK创建的动态代理对象的性能更高，
 *       但是CGLIB创建代理对象时所花费的时间却比JDK多得多。所以对于单例的对象，
 *       因为无需频繁创建对象，用CGLIB合适，反之使用JDK方式要更为合适一些。
 *       同时由于CGLib由于是采用动态创建子类的方法，对于final修饰的方法无法进行代理。
 **/
public class CglibDynamic implements MethodInterceptor {


    private Object target; //目标类

    //对目标类做增强
    public  Object getInstance(Object target){

        this.target=target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return  enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("买房前--->赚钱");
        Object invoke = methodProxy.invoke(object, args);
        System.out.println("买房后---->结婚");
        return invoke;
    }
}
