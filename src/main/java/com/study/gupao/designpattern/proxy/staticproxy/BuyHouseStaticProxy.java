package com.study.gupao.designpattern.proxy.staticproxy;

import com.study.gupao.designpattern.proxy.BuyHouse;
import com.study.gupao.designpattern.proxy.BuyHouseImpl;

/**
 * @program: study-design-pattern
 * @description: 静态代理类
 * @author: Mike
 * @create: 2020-06-27 23:03
 **/
public class BuyHouseStaticProxy implements BuyHouse {

    private  BuyHouse  buyHouse;

    public BuyHouseStaticProxy(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHosue() {
        System.out.println("买房前准备");
        buyHouse.buyHosue();
        System.out.println("买房后装修");

    }


    public static void main(String[] args) {

        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHosue();


        //静态代理的方式，实现了目标对象功能的增强
        //优点---->可以做到在符合开闭原则的情况下对目标对象进行功能扩展。
        //缺点----> 需要为每一个服务都创建代理类，工作量大，而且不易管理。同时一旦接口发生了变更， 代理类也得相应修改
        BuyHouseStaticProxy staticProxy = new BuyHouseStaticProxy(buyHouse);
        staticProxy.buyHosue();

    }
}
