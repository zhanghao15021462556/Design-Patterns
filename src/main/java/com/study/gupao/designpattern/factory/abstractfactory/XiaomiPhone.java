package com.study.gupao.designpattern.factory.abstractfactory;

/**
 * @program: study-design-pattern
 * @description: 小米手机产品
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-20 23:02
 **/
public class XiaomiPhone implements  IPhoneProduct{
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callUp() {
        System.out.println("用小米手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("用小米手机发短信");
    }
}
