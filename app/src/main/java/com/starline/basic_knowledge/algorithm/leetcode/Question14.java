package com.starline.basic_knowledge.algorithm.leetcode;

/**
 * @author jianyu.yang
 * @date 2022/7/8
 **/
public class Question14 {

    public static void main(String... args) {
        String s = longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(s);
    }


    public static String longestCommonPrefix(String[] strs) {
        String common = strs[0];

        for (String str : strs) {
            while (!str.startsWith(common)) {
                common = common.substring(0, common.length() - 1);
            }
        }
        return common;

    }


}
