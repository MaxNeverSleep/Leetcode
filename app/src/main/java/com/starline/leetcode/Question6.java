package com.starline.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "PAYPALISHIRING"行数为 3 时，排列如下：
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 * <p>
 * 请你实现这个将字符串进行指定行数变换的函数：
 * string convert(string s, int numRows);
 * <p>
 * eg.1
 * 输入：s = "PAYPALISHIRING", numRows = 3
 * 输出："PAHNAPLSIIGYIR"
 * 解释：
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * <p>
 *
 * <p>
 * eg.2
 * 输入：s = "PAYPALISHIRING", numRows = 4
 * 输出："PINALSIGYAHRPI"
 * 解释：
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * <p>
 *
 * <p>
 * P       I
 * A     H H
 * Y   S   I   G
 * P I     R N
 * A       I
 **/
public class Question6 {

    public static void main(String... args) {
        convert(4, "PAYPALISHIRING");
    }

    /**
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     * <p>
     * <p>
     * 0    6     12
     * 1  5 7   11 13
     * 2 4  8 10
     * 3    9
     * <p>
     * 0   4   8   12
     * 1 3 5 7 9 11
     * 2   6   10
     * <p>
     * 0     8        16   row=0
     * 1   7  9      15    row=1
     * 2  6   10   14      row=2
     * 3 5     11 13       row=3
     * 4         12        row=4
     */
    public static String convert(int rowNum, String str) {
        StringBuilder convert = new StringBuilder();
        System.out.println(4 * (rowNum - 1));

//        for (int i = 0; i < str.length(); i++) {
//        }

        return "";
    }

}
