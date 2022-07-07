package com.starline.basic_knowledge.algorithm.sort;

/**
 * 快速排序
 *
 * @author jianyu.yang
 * @date 2022/4/26
 **/
public class FastSort {

    public static void quickSort(int[] data) {
        subSort(data, 0, data.length - 1);
    }


    public static void main(String[] args) {
        int[] data = {3, 5, 8, 1, 2, 9, 4, 7, 6};
        for (int i1 = 0; i1 < data.length; i1++) {
            System.out.print(" " + data[i1]);
        }
        System.out.println("");
        quickSort(data);
    }

    private static void subSort(int[] data, int start, int end) {
        if (start < end) {
            int base = data[end];
            int basePoint = end;
            System.out.println("基础index " + basePoint + " 基数 " + base);

            while (true) {
                while (start < end && data[start] <= base) {
                    start++;
                }
                while (start < end && data[end] >= base) {
                    end--;
                }
                if (start < end) {
                    System.out.print("swap " + data[start]);
                    System.out.println(" with " + data[end]);

                    swap(data, start, end);
                } else {
                    break;
                }
            }

            System.out.print("swap " + data[start]);
            System.out.println(" with " + data[basePoint]);

            swap(data, start, basePoint);

            System.out.println("递归开始");
            subSort(data, 0, start - 1);
            subSort(data, start + 1, basePoint);
        }
    }


    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;

        System.out.print("after swap");
        for (int i1 = 0; i1 < data.length; i1++) {
            System.out.print(" " + data[i1]);
        }
        System.out.println("");
    }


}


