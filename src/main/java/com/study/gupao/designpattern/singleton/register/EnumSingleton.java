package com.study.gupao.designpattern.singleton.register;

/**
 * @program: study-design-pattern
 * @description: 枚举单例（最完美的单例模式）
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-21 18:42
 **/
public enum  EnumSingleton {
    INSTANCE;

    public  Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public  static EnumSingleton getSingleton(){
        return  INSTANCE;
    }
}
