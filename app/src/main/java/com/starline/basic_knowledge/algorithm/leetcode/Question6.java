package com.starline.basic_knowledge.algorithm.leetcode;

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
        System.out.println("final result=" + convert("PAYPALISHIRING", 4));
    }

    /**
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     * <p>
     * <p>
     * 0   6      12     row=0  6 6     (6=4+2)
     * 1  5 7   11  13   row=1  4 2 4 2               2=2 3=4 4=6 5=8   2 * (numRows - 1)
     * 2 4   8 10        row=2  2 4 2                 3=2 4=4 5=6       2 * (numRows - 2)
     * 3      9          row=3  6                                       2 * (numRows - 3)
     * <p>                                                              2 * (numRows - 4)
     * 0   4   8   12    row=0  4 4 4   (4=2+2)
     * 1 3 5 7 9 11      row=1  2 2 2 2 2
     * 2   6   10        row=2  4 4
     * <p>
     * 0     8          row=0   8       (8=6+2)      0      1       2
     * 1   7 9    15    row=1   6 2 6                3     4 5     6
     * 2  6  10  14     row=2   4 4 4 4              7    8  9    10
     * 3 5   11 13      row=3   2 6 2                11 12   13 14
     * 4     12         row=4   8                    15       16
     */
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int index;
        int maxGap = 2 * (numRows - 1);
        int gap;
        boolean needMinusGap = false; //标记，处理 6 2 6 2 这种情况的行，如果是true 则需要用firstGap-Gap 比如 6 2 6 2

        for (int i = 0; i < numRows; i++) {
            gap = 2 * (numRows - (i + 1));
            index = i;

            System.out.println("row= " + i);
            System.out.println("gap= " + gap);

            while (index < s.length()) {
                sb.append(s.charAt(index));
                System.out.println("append index= " + index);
                if (maxGap != gap) {
                    if (gap == 0) {
                        index += maxGap;
                    } else {
                        if (needMinusGap) {
                            index += Math.abs(maxGap - gap);
                            needMinusGap = false;
                        } else {
                            index += gap;
                            needMinusGap = true;
                        }
                    }
                } else {
                    index += gap;
                }
            }
            needMinusGap = false;
        }
        return sb.toString();
    }

}
