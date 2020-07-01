package com.study.gupao.designpattern.template.simple;

/**
 * @program: study-design-pattern
 * @description: 具体实现类 A
 * @author: Mike
 * @create: 2020-07-01 10:12
 **/
public class MeCook  extends  Cook{


    //默认添加油
    private  boolean addOilFlag=true;

    //用户设置添加油
    public  void setAddOilFlag(Boolean isAddOil){
        addOilFlag=isAddOil;
    }


    //使用子类的命令决定是否加油
    @Override
    public Boolean isAddOil() {
        return this.addOilFlag;
    }

    @Override
    public void oil() {
        System.out.println("自己做-->多放油");
    }

    @Override
    public void egg() {
        System.out.println("自己做--->放一个鸡蛋");
    }

    @Override
    public void tomato() {
        System.out.println("自己做---->一个西红柿");
    }
}
