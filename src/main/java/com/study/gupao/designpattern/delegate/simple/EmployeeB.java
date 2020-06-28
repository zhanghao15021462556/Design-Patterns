package com.study.gupao.designpattern.delegate.simple;

/**
 * @program: study-design-pattern
 * @description: 员工B
 * @author: Mike
 * @create: 2020-06-28 10:34
 **/
public class EmployeeB  implements  Employee{
    @Override
    public void doWork() {
        System.out.println("我是员工B, 擅长编写SQL语句");
    }
}
