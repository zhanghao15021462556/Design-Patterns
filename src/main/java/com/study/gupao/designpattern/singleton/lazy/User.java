package com.study.gupao.designpattern.singleton.lazy;

/**
 * @program: study-design-pattern
 * @description: 完整的枚举单例   (利用的是Jvm层面本身对枚举类的 限制, 不可通过反射和序列化 的方式破坏单例)
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-21 19:04
 **/
public class User {

    //1,私有构造
    private  User(){}


    //2,枚举类
    static enum  SingletonEnum{
        INSTANCE; //枚举对象，天生为单例

        private User user;

        //3,私有化枚举的构造函数
        private  SingletonEnum(){
            user=new User();
        }


        public  User getInstance(){
            return  user;
        }
    }

    //4.对外暴露一个获取对象静态方法
    public  static  User getInstance(){
        return  SingletonEnum.INSTANCE.getInstance();
    }

    public static void main(String[] args) {
        System.out.println(User.getInstance());
        System.out.println(User.getInstance());
        System.out.println(User.getInstance()==User.getInstance());
    }
}
