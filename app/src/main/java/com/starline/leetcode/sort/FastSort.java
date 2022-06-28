package com.starline.leetcode.sort;

/**
 * 快速排序
 *
 * @author jianyu.yang
 * @date 2022/4/26
 **/
public class FastSort {

    //2 3 1 4 7 8 0 -1

    //-1 0 1 2 7 8 4 3

    //-1 0 1 2 3 4 7 8

    public static int[] arr = new int[]{2, 3, 1, 4, 7, 8, 0, -1};

    public static void main(String... args) {
        startSort(0, arr.length - 1);
        print(arr, 0, arr.length - 1);
    }

    public static void startSort(int left, int right) {
        if (left < right) {
            int mid = sort(0, arr.length - 1);
            sort(0, mid - 1);
            sort(mid + 1, arr.length - 1);
        }
    }

    public static void print(int[] arr, int start, int end) {
        System.out.println();
        for (int i = start; i <= end; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static int sort(int start, int end) {
        int pivot = arr[start];

        int left = start;
        int right = end;

        while (left < right) {
            while (left < right && arr[right] > pivot) {
                right--;
            }
            arr[left] = arr[right];

            while (left < right && arr[left] < pivot) {
                left++;
            }
            arr[right] = arr[left];
        }

        arr[left] = pivot;

        print(arr, 0, left - 1);
        print(arr, left + 1, arr.length - 1);

        return left;
    }

}
