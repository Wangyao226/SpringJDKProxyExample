package com.springboot.jdk.proxy;

/**
 * @Author: ori
 * @Time: 2023/1/19
 */
public class RealAccount implements Account {
    private String name;

    public RealAccount(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Open the account for: " + name);
    }
}
