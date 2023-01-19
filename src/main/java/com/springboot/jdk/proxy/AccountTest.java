package com.springboot.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: ori
 * @Time: 2023/1/19
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new RealAccount("Ori");

        InvocationHandler handler = new AccountHandler(account);

        Account proxy = (Account) Proxy.newProxyInstance(
                account.getClass().getClassLoader(),
                account.getClass().getInterfaces(),
                handler);

        proxy.open();
    }
}
