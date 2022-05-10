package com.starline.leetcode.sort;

/**
 * 选择排序
 * <p>
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 * <p>
 * 选择排序简单直观，英文称为Selection Sort，先在数据中找出最大或最小的元素，放到序列的起始；
 * 然后再从余下的数据中继续寻找最大或最小的元素，依次放到排序序列中，直到所有数据样本排序完成。
 *
 * @author jianyu.yang
 * @date 2022/4/27
 **/
public class SelectionSort {

    public static void main(String... args) {
//        float[] arr=new float[]{ 17.5f, 19.1f, 0.6f, 1.9f, 10.5f, 12.4f, 3.8f, 19.7f, 1.5f, 25.4f, 28.6f, 4.4f, 23.8f, 5.4f};
        int[] arr = new int[]{-9, 0, 3, 9, 1, 5, 7, 2, 6, -1, -6};
        selectionSoft(arr);
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }

    /**
     * SelectionSoft 选择排序
     */
    private static void selectionSoft(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minValueIndex = i;
            for (int j = i; j < arr.length; j++) {
                System.out.println("j:" + j);
                if (arr[j] < arr[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            //找到最小值下标后 与当前i互换位置
            System.out.println("minValueIndex:" + minValueIndex);
            System.out.println("minValue:" + arr[minValueIndex]);
            int temp = arr[i];
            arr[i] = arr[minValueIndex];
            arr[minValueIndex] = temp;
        }
    }


//    /**
//     * SelectionSoft 选择排序
//     */
//    private static void selectionSoft(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int minValueIndex = i;
//            for (int j = i; j < arr.length; j++) {
//                if (arr[j] < arr[minValueIndex]) {
//                    minValueIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minValueIndex];
//            arr[minValueIndex] = temp;
//        }
//    }


}
