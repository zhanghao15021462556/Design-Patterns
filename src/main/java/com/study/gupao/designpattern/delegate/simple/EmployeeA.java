package com.study.gupao.designpattern.delegate.simple;

/**
 * @program: study-design-pattern
 * @description: 员工A ,擅长 Java 开发
 * @author: Mike
 * @create: 2020-06-28 10:25
 **/
public class EmployeeA  implements  Employee{
    @Override
    public void doWork() {
        System.out.println("我是员工A, 擅长Java 后端开发  ");
    }
}
