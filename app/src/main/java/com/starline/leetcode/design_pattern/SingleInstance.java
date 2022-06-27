package com.starline.leetcode.design_pattern;

/**
 * @author jianyu.yang
 * @date 2022/5/23
 **/
public final class SingleInstance {

    private volatile static SingleInstance instance;

    private SingleInstance() {
    }

    public static SingleInstance getInstance() {
        if (instance == null) {
            synchronized (SingleInstance.class) {
                if (instance == null) {
                    instance = new SingleInstance();
                }
            }
        }
        return instance;
    }

}
