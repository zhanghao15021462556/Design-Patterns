package com.study.gupao.designpattern.adapter.simpledemo;

/**
 * @program: study-design-pattern
 * @description:
 * @author: Mike
 * @create: 2020-07-05 23:28
 **/
public class ChinaPowerAdapter  implements  DC5Adapter{

    public static final int voltage = 220;

    @Override
    public boolean support(AC ac) {
        int i = ac.outputAC();

        return voltage==i;
    }

    @Override
    public int outputDC5V(AC ac) {
        int outputAC = ac.outputAC();

        //变压
        int adapterOutput  = outputAC / 44;

        System.out.println("使用ChinaPowerAdapter变压适配器，输入AC:" + outputAC + "V" + "，输出DC:" + adapterOutput + "V");
        return adapterOutput;
    }
}
