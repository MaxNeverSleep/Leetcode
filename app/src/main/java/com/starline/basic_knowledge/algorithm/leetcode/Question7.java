package com.starline.basic_knowledge.algorithm.leetcode;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围[−2³¹, 2³¹− 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * <p>
 * 示例 1：
 * 输入：x = 123
 * 输出：321
 * <p>
 * 示例 2：
 * 输入：x = -123
 * 输出：-321
 * <p>
 * 示例 3：
 * 输入：x = 120
 * 输出：21
 * <p>
 * 示例 4：
 * 输入：x = 0
 * 输出：0
 */
public class Question7 {

    public static void main(String... args) {
        System.out.println(reverse(363847412));
//        2147483648
//        214748363
//        214748363
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            result = x % 10 + result * 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return result;
    }

//    public static int reverse(int x) {
//        boolean isNegative = false;
//        if (x < 0) {
//            isNegative = true;
//        }
//        String s = String.valueOf(Math.abs(x));
//        StringBuilder sb = new StringBuilder();
//        if (s.length() != 1) {
//            for (int i = s.length() - 1; i >= 0; i--) {
//                if (i == s.length() - 1) {
//                    if (s.charAt(i) == '0') {
//                        continue;
//                    }
//                }
//                sb.append(s.charAt(i));
//            }
//            try {
//                int result = Integer.parseInt(sb.toString());
//                if (isNegative) {
//                    return -result;
//                } else {
//                    return result;
//                }
//            } catch (NumberFormatException e) {
//                return 0;
//            }
//        }
//        return x;
//    }

}
