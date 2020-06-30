package com.study.gupao.designpattern.delegate.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: study-design-pattern
 * @description: selvelt的任务分发者 ，主要完成url的映射和调用
 * @author: Mike
 * @create: 2020-06-28 11:44
 **/
public class SelvletDispatcher {

    private List<Handler> handlerMapping = new ArrayList<Handler>();

    public SelvletDispatcher() {

        //在构造中 实现controller的映射
        try {
            Class<MemberAction> clazz = MemberAction.class;

            handlerMapping.add(new Handler()
                    .setController(clazz.newInstance())
                    .setMethod(clazz.getMethod("getMemberById", new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doService(HttpServletRequest request, HttpServletResponse response) {
        doDispatch(request, response);
    }


    //对请求实现分发
    private void doDispatch(HttpServletRequest request, HttpServletResponse response) {
        //1.获取用户请求的url
        String uri = request.getRequestURI();

        Handler handler = null;

        ////2、根据uri 去handlerMapping找到对应的hanler
        for (Handler h : handlerMapping) {
            if (uri.equals(h.getUrl())) {
                handler = h;
                break;
            }
        }

        //3.将具体的任务分发给Method（通过反射去调用其对应的方法）
        Object obj=null;
        try {
            Object mid = handler.getMethod().invoke(handler.getController(), request.getParameter("mid"));

           //4、获取到Method执行的结果，通过Response返回出去
           // response.getWriter().write(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }




}

