package com.study.gupao.designpattern.delegate.simple;

/**
 * @program: study-design-pattern
 * @description: 老板， 向项目经理发送工作信息 （委派模式中，最顶层发命令的人）
 * @author: Mike
 * @create: 2020-06-28 10:55
 **/
public class Boss {

    //对项目经理发号施令， 项目经理又会根据不同的员工擅长的领域，委派给下面的人
    public  void  sendCommand(String command){
        new Leader().doing(command);
    }
}
