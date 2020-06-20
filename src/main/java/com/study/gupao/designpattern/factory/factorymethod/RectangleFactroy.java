package com.study.gupao.designpattern.factory.factorymethod;

/**
 * @program: study-design-pattern
 * @description:
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-20 22:48
 **/
public class RectangleFactroy extends  ShapeFactory {
    @Override
    public Shape getshape() {
        return new Rectangle();
    }
}
