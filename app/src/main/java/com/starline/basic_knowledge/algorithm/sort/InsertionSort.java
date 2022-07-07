package com.starline.basic_knowledge.algorithm.sort;

/**
 * 插入排序
 * <p>
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 * <p>
 * 插入排序英文称为Insertion Sort，它通过构建有序序列，对于未排序的数据序列，
 * 在已排序序列中从后向前扫描，找到相应的位置并插入，类似打扑克牌时的码牌。插入排序有一种优化的算法，可以进行拆半插入。
 * <p>
 * 基本思路是先将待排序序列的第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列；
 * 然后从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置，直到所有数据都完成排序；
 * 如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。
 *
 * @author jianyu.yang
 * @date 2022/4/26
 **/
public class InsertionSort {

    public static void main(String... args) {
//        float[] arr=new float[]{ 17.5f, 19.1f, 0.6f, 1.9f, 10.5f, 12.4f, 3.8f, 19.7f, 1.5f, 25.4f, 28.6f, 4.4f, 23.8f, 5.4f};
        int[] arr = new int[]{-9, 0, 3, 9, 1, 5, 7, 2, 6, -1, -6};
        insertionSort(arr);
        System.out.print("sorted result: ");
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }


    private static void insertionSort(int[] arr) {
        int j;

        for (int i = 1; i < arr.length; i++) {
            j = i - 1;
            int temp = arr[i];

            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }

    }
}
