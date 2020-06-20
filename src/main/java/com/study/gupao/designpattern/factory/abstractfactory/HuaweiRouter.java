package com.study.gupao.designpattern.factory.abstractfactory;

/**
 * @program: study-design-pattern
 * @description: 华为路由器产品
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-20 23:01
 **/
public class HuaweiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("启动华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("打开华为路由器的wifi功能");
    }

    @Override
    public void setting() {
        System.out.println("设置华为路由器参数");
    }
}
