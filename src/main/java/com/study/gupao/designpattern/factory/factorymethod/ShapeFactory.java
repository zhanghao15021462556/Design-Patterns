package com.study.gupao.designpattern.factory.factorymethod;

/**
 * @program: study-design-pattern
 * @description:  　工厂方法模式（Factory Method），又称多态性工厂模式，属于设计模式三大分类中的创建型模式，作为抽象工厂模式的孪生兄弟，\
 *                  工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个，也就是说工厂模式让实例化推迟到子类
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-20 22:41
 **/
public abstract  class ShapeFactory {

    public abstract Shape getshape();
}
