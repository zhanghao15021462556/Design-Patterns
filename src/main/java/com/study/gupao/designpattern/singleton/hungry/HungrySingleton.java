package com.study.gupao.designpattern.singleton.hungry;

/**
 * @program: study-design-pattern
 * @description: 饿汉式单例
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-21 11:02
 **/
public class HungrySingleton {


    //静态变量，在类调用时候，初始化一次，放入静态常量池中， 所以，饿汉式单例天生就是线程安全的
    private  static  final  HungrySingleton singleton=new HungrySingleton();

       //1,构造私有
     private  HungrySingleton(){

     }

     //2.提供外部获取途径
     public  static  HungrySingleton getSingleton(){
         return  singleton;
     }


}
