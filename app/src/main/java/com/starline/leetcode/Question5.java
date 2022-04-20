package com.starline.leetcode;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author jianyu.yang
 * @date 2022/4/3
 **/
public class Question5 {

//abbd
//123123abcddcba123

//12adcda2
//2adcda21

//01adda67
//12312adcda12ac3
//12312adceaaecda123


    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        String result = "";
        int x, y;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    
                    new StringBuilder("1").reverse().toString();
                }
            }
        }
        if (result.length() != 0) {
            return result;
        } else {
            return s.substring(0, 1);
        }
    }


//    public static String longestPalindrome(String s) {
//        String result = "";
//        int x, y;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = s.length() - 1; j > i; j--) {
//                if (s.charAt(i) == s.charAt(j)) {
//                    x = i;
//                    y = j;
//                    while (x < y) {
//                        if (s.charAt(x) != s.charAt(y)) {
//                            break;
//                        } else {
//                            x++;
//                            y--;
//                            if (x >= y) {
//                                if (result.length() < (j - i + 1)) {
//                                    result = s.substring(i, j + 1);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        if (result.length() != 0) {
//            return result;
//        } else {
//            return s.substring(0, 1);
//        }
//    }


}
