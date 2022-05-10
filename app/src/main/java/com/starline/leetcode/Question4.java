package com.starline.leetcode;

/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 * <p>
 * <p>
 * 示例 1：
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * <p>
 * 示例 2：
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 **/
public class Question4 {


    public static void main(String... args) {
//        int[] nums1 = new int[]{1, 2, 6, 8, 10};
//        int[] nums2 = new int[]{3, 4, 7, 9, 14};

        int[] nums1 = new int[]{1,3,5,7,9};
        int[] nums2 = new int[]{2,4,6,8,10};


        System.out.println(getMidden(nums1, nums2));
    }


    public static double getMidden(int[] nums1, int[] nums2) {
        int[] combine = new int[nums1.length + nums2.length];
        double midden = 0;

        int n1 = 0;
        int n2 = 0;

        for (int i = 0; i <= (nums1.length + nums2.length) - 1; i++) {
            if (n1 >= nums1.length) {
                combine[i] = nums2[n2];
                n2++;
            } else if (n2 >= nums2.length) {
                combine[i] = nums1[n1];
                n1++;
            } else {
                if (nums1[n1] <= nums2[n2]) {
                    combine[i] = nums1[n1];
                    n1++;
                } else {
                    combine[i] = nums2[n2];
                    n2++;
                }
            }

            if ((nums1.length + nums2.length) % 2 == 0) {
                if (i == ((nums1.length + nums2.length) / 2)) {
                    midden = (combine[i - 1] + combine[i]) / 2f;
                    break;
                }
                //偶数长度
            } else {
                if (i == (nums1.length + nums2.length) / 2) {
                    midden = combine[i];
                    break;
                }
            }
        }

        return midden;
    }

}
