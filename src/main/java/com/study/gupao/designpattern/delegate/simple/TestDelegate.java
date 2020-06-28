package com.study.gupao.designpattern.delegate.simple;

/**
 * @program: study-design-pattern
 * @description: 测试 委派模式
 * @author: Mike
 * @create: 2020-06-28 11:02
 **/
public class TestDelegate {

    //委派模式 优缺点
    //优点-->减少了大量的if/else 的判断语句
    //缺点---> 代码量比较大，类比较多
    //使用场景---> 一件事情， 对象本身不知道怎么处理，对象把请求交给其他对象来做

    public static void main(String[] args) {
         new Boss().sendCommand("后端数据加密");
    }
}
