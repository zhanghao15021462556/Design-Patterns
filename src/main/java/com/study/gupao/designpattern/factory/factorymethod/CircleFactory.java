package com.study.gupao.designpattern.factory.factorymethod;

/**
 * @program: study-design-pattern
 * @description:
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-20 22:47
 **/
public class CircleFactory  extends   ShapeFactory{

    @Override
    public Shape getshape() {
        return  new Circle();
    }
}
