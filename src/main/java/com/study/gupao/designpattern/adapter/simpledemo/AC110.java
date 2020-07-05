package com.study.gupao.designpattern.adapter.simpledemo;

/**
 * @program: study-design-pattern
 * @description:
 * @author: Mike
 * @create: 2020-07-05 23:26
 **/
public class AC110  implements  AC{

    public final int output = 110;
    @Override
    public int outputAC() {
        return output;
    }


}
