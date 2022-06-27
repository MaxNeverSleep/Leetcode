package com.starline.leetcode.base;

import java.util.HashMap;

/**
 * @author jianyu.yang
 * @date 2022/5/23
 **/
public class Lock {

    public static volatile boolean flag = false;

    public static void main(String... args) {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }

}
