package com.study.gupao.designpattern.factory.abstractfactory;

/**
 * @program: study-design-pattern
 * @description: 具体的小米产品工厂
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-20 23:07
 **/
public class XiaomiProductFactory implements  IProductFactory {
    @Override
    public IPhoneProduct produceTelPhone() {
        System.out.println(">>>>>>生产小米手机");
        return  new XiaomiPhone();
    }

    @Override
    public IRouterProduct produceRouter() {
        System.out.println(">>>>>>生产小米路由器");
        return new XiaomiRouter();
    }
}
