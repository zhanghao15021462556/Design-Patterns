package com.study.gupao.designpattern.proxy;

/**
 * @program: study-design-pattern
 * @description:
 * @author: Mike
 * @create: 2020-06-27 23:02
 **/
public class BuyHouseImpl implements  BuyHouse{
    @Override
    public void buyHosue() {
        System.out.println("两年内,我要买房");
    }
}
