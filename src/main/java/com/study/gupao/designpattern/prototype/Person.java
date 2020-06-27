package com.study.gupao.designpattern.prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: study-design-pattern
 * @description: 克隆类实体
 * @author: zhanghao
 * @Sync-Method:
 * @create: 2020-06-22 22:52
 **/

@Data
public class Person implements Cloneable {

    //姓名
    private String name;
    //年龄
    private int age;
    //朋友
    private List<String> friends;


    //浅克隆
    public Person shallowClone() {
        try {

            return (Person) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    //深克隆
    public Person deepClone() {
        try {
            Person person = (Person) super.clone();

            List<String> newFriends = new ArrayList<>();


            //对应非基本数据类型的字段， 引用在内存中指向的是一块的内存空间，所以需要新创建引用对象，才能算深度克隆
            for (String friend : this.friends) {
                newFriends.add(friend);
            }

            person.setFriends(newFriends);

            return person;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }



    public static void main(String[] args) {
        //创建对象person1
        Person person1 = new Person();
        //初始化对象
        person1.setName("zhangsan");
        person1.setAge(20);
        List<String> friends = new ArrayList<String>();
        friends.add("lisi");
        friends.add("wangwu");
        person1.setFriends(friends);

        //person2是浅层克隆
        Person person2 = person1.shallowClone();
        //person3是深层克隆
        Person person3 = person1.deepClone();
        //获取浅层克隆的friends的list对象
        List<String> person2_friends = person2.getFriends();
        //向引用对象中添加值
        person2_friends.add("shallow");
        person2.setFriends(person2_friends);
        //获取深层克隆的friends的list对象
        List<String> person3_friends = person3.getFriends();
        //向引用对象中添加值
        person3_friends.add("deep");
        person3.setFriends(person3_friends);

        System.out.println("原型："+person1);
        System.out.println("浅层克隆："+person2);
        System.out.println("深层克隆："+person3);
    }


}
