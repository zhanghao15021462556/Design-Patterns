package com.study.gupao.designpattern.factory.simplefactory;


/**
 * @program: study-design-pattern
 * @description: 简单工厂  又叫做静态工厂模式（Static Factory Method），由一个工厂对象决定创建出哪一种产品类的实例，
 *                         简单工厂模式的实质是由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类。属于创建型模式，但不属于GOF23设计模式
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-20 22:26
 **/
public class ShapeFactory {

     public  Shape getShape(String shapeType) {
         if (shapeType.equalsIgnoreCase("circle")) {
             return new Circle();
         } else if (shapeType.equalsIgnoreCase("rectangle")) {
             return new Rectangle();
         } else if (shapeType.equalsIgnoreCase("squere")) {
             return new Squere();
         }
         return  null;
     }


    public Shape getShape(Class clazz) throws Exception{
        return (Shape) clazz.newInstance();
    }

}
