package com.study.gupao.designpattern.adapter.simpledemo;

/**
 * @program: study-design-pattern
 * @description:
 * @author: Mike
 * @create: 2020-07-05 23:27
 **/
public class AC220 implements  AC {
    public final int output = 220;
    @Override
    public int outputAC() {
        return output;
    }
}
