package com.starline.leetcode.dynamic_programming;

/**
 * 有一座高度是10级台阶的楼梯，从下往上走，每跨一步只能向上1级或者2级台阶。要求用程序来求出一共有多少种走法。
 *
 * @author jianyu.yang
 * @date 2022/5/12
 **/
public class WalkTheStairs {

    //4=111、22、211、121、112
    //3=111、12、21
    //2=11、2
    //1=1

    //1 2 3 4 5 6 7 8 9 10

    public static void main(String... args) {
        int a = climbStairs2(2);
        System.out.println(a);
    }

    public static int climbStairs(int n) {
        int p = 0, q = 0;
        int r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }


    public static int climbStairs2(int n) {
        if (n <= 2) {
            return n;
        }
        int totalStep = 0;

        int prev1 = 2;
        int prev2 = 1;

        for (int i = 3; i <= n; i++) {
            totalStep = prev1 + prev2;
            prev2 = prev1;
            prev1 = totalStep;
        }
        return totalStep;

    }

}
