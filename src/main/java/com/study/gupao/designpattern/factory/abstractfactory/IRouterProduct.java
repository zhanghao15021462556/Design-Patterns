package com.study.gupao.designpattern.factory.abstractfactory;

/**
 *  路由器产品接口
 *
 *  抽象产品
 */
public interface IRouterProduct {
    /**
     * 开机
     */
    void start();

    /**
     * 关机
     */
    void shutdown();

    /**
     * 开启wifi
     */
    void openWifi();

    /**
     * 设置参数
     */
    void setting();

}
