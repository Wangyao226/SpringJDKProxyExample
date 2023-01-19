package com.springboot.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: ori
 * @Time: 2023/1/19
 */
public class AccountHandler implements InvocationHandler {
    private Object object;

    public AccountHandler(Object object) {
        super();
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        doBefore();
        result = method.invoke(object, args);
        doAfter();
        return result;
    }

    private void doAfter() {
        System.out.println("开户前");
    }

    private void doBefore() {
        System.out.println("开户后");
    }
}
