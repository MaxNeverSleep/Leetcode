package com.starline.basic_knowledge.algorithm.sample;

/**
 * 二分法查找
 *
 * @author jianyu.yang
 * @date 2022/4/25
 **/
public class BinarySearch {

    public static void main(String... args) {
        int[] arr = new int[]{-11, -3, -1, 0, 1, 3, 5, 6, 7, 8, 12, 15, 17, 21, 72};
        System.out.println(binarySearch(3, arr));
    }

    /**
     * target值的index
     */
    private static int targetIndex = 0;


    public static int binarySearch(int target, int[] arr) {

        //先取arr的中间index，如果是偶数长度数组则取靠左的index
        int index = (arr.length - 1) / 2;

        //如果长度为0则找不到target
        if (arr.length == 0) {
            return -1;
        }

        //如果中间index的值为target直接返回
        if (arr[index] == target) {
            return index + targetIndex;
        }

        //如果中间index值比target大 取左边子数组递归
        if (arr[index] > target) {
            int[] newArr = new int[index];
            System.arraycopy(arr, 0, newArr, 0, index);
            return binarySearch(target, newArr);
        }

        //如果中间index值比target小 取右边子数组递归
        if (arr[index] < target) {
            int[] newArr = new int[arr.length - index - 1];
            System.arraycopy(arr, index + 1, newArr, 0, arr.length - index - 1);

            //保存左边数组长度
            targetIndex += (index + 1);
            return binarySearch(target, newArr);
        }

        return -1;
    }


}
