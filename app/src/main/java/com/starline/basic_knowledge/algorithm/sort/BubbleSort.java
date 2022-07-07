package com.starline.basic_knowledge.algorithm.sort;

/**
 * 冒泡排序
 * <p>
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(1)
 * <p>
 * 冒泡排序是排序算法中较为简单的一种，英文称为Bubble Sort。它遍历所有的数据，
 * 每次对相邻元素进行两两比较，如果顺序和预先规定的顺序不一致，则进行位置交换；
 * 这样一次遍历会将最大或最小的数据上浮到顶端，之后再重复同样的操作，直到所有的数据有序。
 *
 * @author jianyu.yang
 * @date 2022/4/27
 **/
public class BubbleSort {

    public static void main(String... args) {
//        float[] arr=new float[]{ 17.5f, 19.1f, 0.6f, 1.9f, 10.5f, 12.4f, 3.8f, 19.7f, 1.5f, 25.4f, 28.6f, 4.4f, 23.8f, 5.4f};
        int[] arr = new int[]{-9, 0, 3, 9, 1, 5, 7, 2, 6, -1, -6};
        bubbleSort(arr);
        System.out.print("sorted result: ");
        for (int j : arr) {
            System.out.print(" " + j);
        }
    }

    /**
     * BubbleSort 冒泡排序
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - 1 - i; j++) {
                //互换位置
                if (arr[j] < arr[j - 1]) {
                    System.out.println(arr[j - 1] + " and " + arr[j] + " switch places");
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

                for (int d : arr) {
                    System.out.print(d);
                }
                System.out.println("");
            }
        }
    }

//    /**
//     * BubbleSort 冒泡排序
//     */
//    public static void bubbleSort(int[] arr) {
//        for (int i = 0; i <= arr.length - 1; i++) {
//            for (int j = 1; j <= arr.length - 1 - i; j++) {
//                //互换位置
//                if (arr[j] < arr[j - 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }
//            }
//        }
//    }


}
