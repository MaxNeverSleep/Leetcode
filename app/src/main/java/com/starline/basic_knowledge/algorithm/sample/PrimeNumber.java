package com.starline.basic_knowledge.algorithm.sample;

/**
 * 求start和end区间的素数
 *
 * @author jianyu.yang
 * @date 2022/4/24
 **/
public class PrimeNumber {


    public static void main(String... args) {
        getPrimeNumber(200, 300);
    }

    public static void getPrimeNumber(int start, int end) {
        for (int i = start; i < end; i++) {
            boolean isPrimeNumber = true;
            for (int a = 2; a < i; a++) {
                if (i % a == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.println("PrimeNumber:" + i);
            }
        }
    }


}
