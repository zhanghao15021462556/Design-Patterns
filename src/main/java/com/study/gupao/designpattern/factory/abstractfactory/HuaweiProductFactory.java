package com.study.gupao.designpattern.factory.abstractfactory;

/**
 * @program: study-design-pattern
 * @description: 具体的华为产品工厂
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-20 23:04
 **/
public class HuaweiProductFactory implements  IProductFactory {
    @Override
    public IPhoneProduct produceTelPhone() {
        System.out.println("------------>生产华为手机");
        return  new HuaweiPhone();
    }

    @Override
    public IRouterProduct produceRouter() {
        System.out.println("------------>生产华为路由器");
        return  new HuaweiRouter();
    }
}
