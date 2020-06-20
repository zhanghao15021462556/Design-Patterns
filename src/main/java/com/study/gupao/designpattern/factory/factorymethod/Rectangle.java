package com.study.gupao.designpattern.factory.factorymethod;

/**
 * @program: study-design-pattern
 * @description:
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-20 22:42
 **/
public class Rectangle  implements  Shape{
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
