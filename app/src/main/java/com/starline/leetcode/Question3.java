package com.starline.leetcode;


/**
 * 滑动窗口
 *
 * @author jianyu.yang
 * @date 2022/4/6
 **/
public class Question3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }


    public static int lengthOfLongestSubstring(String s) {
        int windowSize = 0;
        int first = 0;
        int second = 0;

        while (second < s.length()) {
            if (s.substring(first, second).contains(String.valueOf(s.charAt(second)))) {
                first++;
                int current = second - first + 1;
                if (windowSize < current) {
                    windowSize = current;
                }
            } else {
                int current = second - first + 1;
                if (windowSize < current) {
                    windowSize = current;
                }
                second++;
            }
        }
        return windowSize;
    }

}
