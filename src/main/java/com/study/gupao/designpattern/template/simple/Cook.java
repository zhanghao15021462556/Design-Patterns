package com.study.gupao.designpattern.template.simple;

/**
 * @program: study-design-pattern
 * @description: 模板类骨架 抽象类
 * @author: Mike
 * @create: 2020-07-01 10:08
 **/
public abstract class Cook {

    //放油
    public abstract void oil();

    //放鸡蛋
    public abstract void egg();

    //放西红柿
    public abstract void tomato();

    //钩子方法，让子类来决定是否需要加油
    public Boolean isAddOil() {
        return true;
    }


    //吧做饭的方法封装起来
    final public void cook() {

        this.egg();
        this.tomato();
        if(isAddOil()){
            this.oil();
        }

    }
}
