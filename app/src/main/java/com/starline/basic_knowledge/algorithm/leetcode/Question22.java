package com.starline.basic_knowledge.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jianyu.yang
 * @date 2022/7/8
 **/
public class Question22 {

    public static void main(String...args){
        generateParenthesis(3);
    }

    static List<String> res = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return res;
    }

    private static void dfs(int left, int right, String curStr) {
        // 左右括号都不剩余了，递归终止
        if (left == 0 && right == 0) {
            res.add(curStr);
            return;
        }

        // 如果左括号还剩余的话，可以拼接左括号
        if (left > 0) {
            dfs(left - 1, right, curStr + "(");
        }

        // 如果右括号剩余多于左括号剩余的话，可以拼接右括号
        if (right > left) {
            dfs(left, right - 1, curStr + ")");
        }

    }

}
