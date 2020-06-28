package com.study.gupao.designpattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: study-design-pattern
 * @description: 委派模式项目经理
 * @author: Mike
 * @create: 2020-06-28 10:45
 **/
public class Leader {

    //项目经理知道团队里，每个擅长的的技术领域， 所以通过静态的变量保存这些对应的信息
    private Map<String,Employee> register = new HashMap<String,Employee>();

    public  Leader(){
        register.put("后端数据加密",new EmployeeA());
        register.put("SQL编写",new EmployeeB());
        register.put("Jvm 性能优化",new EmployeeC());
    }

        //项目经理干活的方式，委派给下面 擅长对应领域的员工|
    public  void  doing(String  command){
        this.register.get(command).doWork();
    }
}
