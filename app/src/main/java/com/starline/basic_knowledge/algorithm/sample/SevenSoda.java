package com.starline.basic_knowledge.algorithm.sample;

/**
 * 每7个空瓶可以换1瓶汽水，求n瓶汽水能喝多少瓶汽水
 *
 * @author jianyu.yang
 * @date 2022/4/24
 **/
public class SevenSoda {

    private static int sum = 0;
    private static int last = 0;

    public static void main(String[] args) {
        drink(300);
        System.out.println("total=" + sum);
    }

    public static void drink(int n) {
        sum += n;
        if (n / 7 != 0) {
            drink(n / 7);
            last = n % 7;
        } else if ((last + (n % 7)) >= 7) {
            drink((last + n % 7) / 7);
        }
    }
}
