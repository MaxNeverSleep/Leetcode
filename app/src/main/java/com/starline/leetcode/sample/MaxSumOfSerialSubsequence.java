package com.starline.leetcode.sample;

import java.util.HashMap;

/**
 * @author jianyu.yang
 * @date 2022/5/11
 **/
public class MaxSumOfSerialSubsequence {

    public static int[] arr = {3, -4, 2, -1, 2, 6, -5, 4};

    public static void main(String[] args) {

        int maxSum = findMaxSumOfSerialSubsequence();
        System.out.println("max sum=" + maxSum);
    }

    /**
     * 暴力破解法
     *
     * @return
     */
    private static int findMaxSumOfSerialSubsequence() {
        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            
        }

        return maxSum;
    }


//    /**
//     * 暴力破解法
//     *
//     * @return
//     */
//    private static int findMaxSumOfSerialSubsequence() {
//        int maxSum = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum += arr[j];
//                if (sum > maxSum) {
//                    maxSum = sum;
//                }
//            }
//        }
//
//        return maxSum;
//    }


}
