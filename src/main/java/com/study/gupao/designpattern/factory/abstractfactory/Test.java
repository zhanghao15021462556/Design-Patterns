package com.study.gupao.designpattern.factory.abstractfactory;

/**
 * @program: study-design-pattern
 * @description: 测试类
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-20 23:08
 **/
public class Test {

    public static void main(String[] args) {
        System.out.println("===================小米系列产品=================");

        IProductFactory xiaomiProductFactory = new XiaomiProductFactory();

        IRouterProduct xiaomiRouter = xiaomiProductFactory.produceRouter();
        xiaomiRouter.start();
        xiaomiRouter.setting();
        xiaomiRouter.openWifi();
        xiaomiRouter.shutdown();

        System.out.println("===================华为系列产品=================");
        //华为产品工厂实例
        IProductFactory huaweiProductFactory = new HuaweiProductFactory();
        //生产华为路由器
        IRouterProduct huaweiRouter = huaweiProductFactory.produceRouter();
        huaweiRouter.start();
        huaweiRouter.setting();
        huaweiRouter.openWifi();
        huaweiRouter.shutdown();

    }


}
