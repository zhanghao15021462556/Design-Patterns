package com.study.gupao.designpattern.proxy;

import com.study.gupao.designpattern.proxy.dynamic.CglibDynamic;
import com.study.gupao.designpattern.proxy.dynamic.JdkDynamic;

import java.lang.reflect.Proxy;

/**
 * @program: study-design-pattern
 * @description: 代理测试类
 * @author: Mike
 * @create: 2020-06-27 23:15
 **/
public class TestProxy {

   /* public static void main(String[] args) {

        BuyHouse buyHouse = new BuyHouseImpl();

        BuyHouse proxyInstance = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[]{BuyHouse.class}, new JdkDynamic(buyHouse));

        proxyInstance.buyHosue();

    }*/

    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();

        CglibDynamic cglibDynamic = new CglibDynamic();
        BuyHouseImpl buyHouseCglibProxy  = (BuyHouseImpl) cglibDynamic.getInstance(buyHouse);

        buyHouseCglibProxy .buyHosue();


    }
}
