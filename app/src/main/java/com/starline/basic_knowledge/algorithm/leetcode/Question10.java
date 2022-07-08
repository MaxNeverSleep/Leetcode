package com.starline.basic_knowledge.algorithm.leetcode;

/**
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 * <p>
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/regular-expression-matching
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Question10 {

    public static char singleChar = '.';
    public static char multiChar = '*';

    public static void main(String... args) {
        boolean a = isMatch("aab", "a*b");
        System.out.println("is match =" + a);
    }

    //aa
    //*a
    public static boolean isMatch(String s, String p) {
        boolean isMatch = true;
        int index = 0;
        char temp;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '.') {
                index++;
            } else if (p.charAt(i) == '*') {
                temp = s.charAt(index);
                for (; index < s.length(); index++) {
                    if (s.charAt(index) != temp) {
                        break;
                    }
                }
            } else if (p.charAt(i) == s.charAt(index)) {
                index++;
            } else {
                isMatch = false;
                break;
            }
        }
        if (index != s.length()) {
            isMatch = false;
        }
        return isMatch;
    }


}
