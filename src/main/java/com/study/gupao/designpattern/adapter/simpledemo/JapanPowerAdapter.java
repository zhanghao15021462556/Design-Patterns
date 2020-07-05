package com.study.gupao.designpattern.adapter.simpledemo;

/**
 * @program: study-design-pattern
 * @description:
 * @author: Mike
 * @create: 2020-07-05 23:31
 **/
public class JapanPowerAdapter implements DC5Adapter {

    public static final int voltage = 110;

    @Override
    public boolean support(AC ac) {
        return ac.outputAC() == voltage;
    }

    @Override
    public int outputDC5V(AC ac) {
        int outputAC = ac.outputAC();

        //变压
        int adapterOutput = outputAC / 22;

        System.out.println("使用JapanPowerAdapter变压适配器，输入AC:" + outputAC + "V" + "，输出DC:" + adapterOutput + "V");
        return adapterOutput;

    }
}
