package com.study.gupao.designpattern.factory.abstractfactory;

/**
 * 抽象产品工厂（定义了同一个产品族的产品生产行为）
 *
 * Abstract Factory
 */
public interface IProductFactory {

    /**
     * 生产手机
     * @return
     */
    IPhoneProduct produceTelPhone();

    /**
     * 生产路由器
     * @return
     */
    IRouterProduct produceRouter();

}
