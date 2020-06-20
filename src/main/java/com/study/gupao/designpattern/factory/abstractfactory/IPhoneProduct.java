package com.study.gupao.designpattern.factory.abstractfactory;


/**
 * 手机产品接口
 *
 *  顶层模块，定义所有的行为
 *
 *  抽象产品
 *
 */
public interface IPhoneProduct {

    /**
     * 开机
     */
    void start();

    /**
     * 关机
     */
    void shutdown();

    /**
     * 拨打电话
     */
    void callUp();

    /**
     * 发送短信
     */
    void sendSMS();

}
