package com.starline.basic_knowledge.algorithm.sort;

/**
 * 归并排序
 * <p>
 * 时间复杂度 O(n log n)
 * 空间复杂度 O(n)
 * <p>
 * 归并排序英文称为Merge Sort，归并排序是建立在归并操作上的一种有效的排序算法。
 * 该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。
 * 它首先将数据样本拆分为两个子数据样本, 并分别对它们排序, 最后再将两个子数据样本合并在一起;
 * 拆分后的两个子数据样本序列, 再继续递归的拆分为更小的子数据样本序列,
 * 再分别进行排序, 直到最后数据序列为1，而不再拆分，此时即完成对数据样本的最终排序。
 * 归并排序严格遵循从左到右或从右到左的顺序合并子数据序列, 它不会改变相同数据之间的相对顺序, 因此归并排序是一种稳定的排序算法.
 * <p>
 * 作为一种典型的分而治之思想的算法应用，归并排序的实现分为两种方法：
 * 自上而下的递归；
 * 自下而上的迭代；
 *
 * @author jianyu.yang
 * @date 2022/4/27
 **/
public class MergeSort {

    private static int[] arr = new int[]{11, 8, 3, 9, 7, 1, 2, 5};
    //    private static int[] arr = new int[]{3, 8, 9, 11, 1, 2, 5, 7};
    private static int[] sortedArr = new int[arr.length];

    public static void main(String... args) {
        System.out.print("arr: ");
        for (int j : arr) {
            System.out.print(" " + j);
        }
        System.out.println();
        mergeSoft(arr);

    }

    public static int[] mergeSoft(int[] arr) {
        int[] leftArr = sliceLeft(arr);
        int[] rightArr = sliceRight(arr);

        if (leftArr.length == 1 && rightArr.length == 1) {
            return merge(leftArr, rightArr);
        } else {

            if (leftArr.length != 1) {
                leftArr = mergeSoft(leftArr);
            }

            if (rightArr.length != 1) {
                rightArr = mergeSoft(rightArr);
            }

        }
        return merge(leftArr, rightArr);
    }

    /**
     * cut left of arr
     */
    public static int[] sliceLeft(int[] arr) {
        int[] newArr = new int[arr.length / 2];
        System.arraycopy(arr, 0, newArr, 0, newArr.length);

        System.out.print("sliceLeft:");
        for (int j : newArr) {
            System.out.print(" " + j);
        }
        System.out.println();
        return newArr;
    }

    /**
     * cut right of arr
     */
    public static int[] sliceRight(int[] arr) {
        int[] newArr = new int[arr.length / 2];
        System.arraycopy(arr, arr.length / 2, newArr, 0, newArr.length);

        System.out.print("sliceRight:");
        for (int j : newArr) {
            System.out.print(" " + j);
        }
        System.out.println();
        return newArr;
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = 0;
        int n2 = 0;

        System.out.print("merge arr1: ");
        for (int j : arr1) {
            System.out.print(" " + j);
        }
        System.out.println();

        System.out.print("merge arr2: ");
        for (int j : arr2) {
            System.out.print(" " + j);
        }
        System.out.println();

        int[] combine = new int[arr1.length + arr2.length];

        for (int i = 0; i <= (arr1.length + arr2.length) - 1; i++) {
            if (n1 >= arr1.length) {
                combine[i] = arr2[n2];
                n2++;
            } else if (n2 >= arr2.length) {
                combine[i] = arr1[n1];
                n1++;
            } else {
                if (arr1[n1] <= arr2[n2]) {
                    combine[i] = arr1[n1];
                    n1++;
                } else {
                    combine[i] = arr2[n2];
                    n2++;
                }
            }
        }

        System.out.print("merge result : ");
        for (int j : combine) {
            System.out.print(" " + j);
        }
        System.out.println();

        return combine;
    }


}
