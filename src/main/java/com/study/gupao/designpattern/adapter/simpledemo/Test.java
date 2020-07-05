package com.study.gupao.designpattern.adapter.simpledemo;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: study-design-pattern
 * @description:
 * @author: Mike
 * @create: 2020-07-05 23:32
 **/
public class Test {


    private List<DC5Adapter> adapters=  new  LinkedList<DC5Adapter>();

    public Test() {
        this.adapters.add(new ChinaPowerAdapter());
        this.adapters.add(new JapanPowerAdapter());
    }



    //根据电压寻找合适的变压器
    public  DC5Adapter getPowerAdapter(AC ac){
        DC5Adapter dc5Adapter=null;

        for (DC5Adapter adapter :this.adapters) {
            if(adapter.support(ac)){
                dc5Adapter=adapter;
                break;
            }
        }

        if(adapters==null){
            throw  new IllegalArgumentException("没有找到合适的变压适配器");
        }

        return  dc5Adapter;

    }

    public static void main(String[] args) {

        Test test = new Test();
        AC220 china = new AC220();
        DC5Adapter powerAdapter = test.getPowerAdapter(china);
        powerAdapter.outputDC5V(china);


        AC110 japan = new AC110();
        DC5Adapter powerAdapter1 = test.getPowerAdapter(japan);
        powerAdapter1.outputDC5V(japan);



    }
}
