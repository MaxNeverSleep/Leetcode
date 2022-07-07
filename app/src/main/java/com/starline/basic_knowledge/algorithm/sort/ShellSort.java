package com.starline.basic_knowledge.algorithm.sort;

/**
 * 希尔排序
 * <p>
 * 时间复杂度 O(n log n)
 * 空间复杂度 O(1)
 * <p>
 *
 * 希尔排序也称递减增量排序，是插入排序的一种改进版本，英文称为Shell Sort，效率虽高，但它是一种不稳定的排序算法。
 *
 * 插入排序在对几乎已经排好序的数据操作时，效果是非常好的；但是插入排序每次只能移动一位数据，因此插入排序效率比较低。
 *
 * 希尔排序在插入排序的基础上进行了改进，它的基本思路是先将整个数据序列分割成若干子序列分别进行直接插入排序，待整个序列中的记录基本有序时，再对全部数据进行依次直接插入排序。
 *
 * @author jianyu.yang
 * @date 2022/4/27
 **/
public class ShellSort {

    public static void main(String... args) {
//        float[] arr=new float[]{ 17.5f, 19.1f, 0.6f, 1.9f, 10.5f, 12.4f, 3.8f, 19.7f, 1.5f, 25.4f, 28.6f, 4.4f, 23.8f, 5.4f};
        int[] arr = new int[]{-9, 0, 3, 9, 1, 5, 7, 2, 6, -1, -6};
        shellSort(arr);
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }

    private static void shellSort(int[] arr) {

    }


}
