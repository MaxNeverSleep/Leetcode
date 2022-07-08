package com.starline.basic_knowledge.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jianyu.yang
 * @date 2022/7/8
 **/
public class Question15 {

    public static void main(String... args) {
//        threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        threeSum(new int[]{0, 0, 0, 0});

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int a = 0; a < nums.length - 2; a++) {
            if (nums[a] > 0) {
                break;
            }
            if (a != 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            int left = a + 1;
            int right = nums.length - 1;
            while (left < right) {
                int result = nums[a] + nums[left] + nums[right];
                if (result < 0) {
                    while (left < right && nums[left] == nums[++left]) {}
                } else if (result > 0) {
                    while (right > left && nums[right] == nums[--right]) {}
                } else {
                    System.out.println("a=" + nums[a] + "  b=" + nums[left] + "  c=" + nums[right]);
                    ArrayList list = new ArrayList<Integer>();
                    list.add(nums[a]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    while (left < right && nums[left] == nums[++left]) {}
                    while (right > left && nums[right] == nums[--right]) {}
                }
            }
        }
        return res;
    }

}
