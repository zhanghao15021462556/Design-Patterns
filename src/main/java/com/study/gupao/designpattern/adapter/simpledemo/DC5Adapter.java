package com.study.gupao.designpattern.adapter.simpledemo;

/**
 *  电压转5v适配器
 */
public interface DC5Adapter {

    boolean support(AC ac);

    int outputDC5V(AC ac);

}
