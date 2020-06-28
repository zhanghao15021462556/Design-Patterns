package com.study.gupao.designpattern.delegate.simple;

/**
 * @program: study-design-pattern
 * @description: 员工C
 * @author: Mike
 * @create: 2020-06-28 10:42
 **/
public class EmployeeC implements  Employee{
    @Override
    public void doWork() {
        System.out.println("我是员工C, 擅长JVM性能优化");
    }
}
