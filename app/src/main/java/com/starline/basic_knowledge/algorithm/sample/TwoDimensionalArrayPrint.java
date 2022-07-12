package com.starline.basic_knowledge.algorithm.sample;

/**
 * @author jianyu.yang
 * @date 2022/7/7
 **/
public class TwoDimensionalArrayPrint {

    public static void main(String... args) {
        char[][] chars = new char[][]{
                {'T', 'C', 'S', 'A'},
                {'U', 'Z', 'I', 'B'},
                {'Y', 'C', 'G', 'H'}};
//        char[][] chars = new char[][]{
//                {'T', 'A', 'S', 'A'},
//                {'U', 'Z', 'I', 'B'},
//                {'Y', 'C', 'G', 'H'}};
        System.out.println("final result=" + isExist(chars));
    }

    public static boolean isExist(char[][] chars) {
        boolean isExist = false;
        char[] csig = new char[]{'C', 'S', 'I', 'G'};

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if (chars[i][j] == csig[0]) {
                    //起始点
                    x = i;
                    y = j;
                    for (int l = 1; l < csig.length; l++) {
                        boolean isCharExist = search(csig[l], chars, x, y);
                        if (!isCharExist) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return isExist;
    }

    static int x;
    static int y;

    public static boolean search(char c, char[][] chars, int i, int j) {
        System.out.println("search char[" + c + "] start with x=" + x + " y=" + y);
        //水平
        for (int j2 = j; j2 < chars[i].length; j2++) {
            if (chars[i][j2] == c) {
                System.out.println("char[" + c + "] exist in x" + x + " y" + y);
                x = i;
                y = j2;
                return true;
            }
        }

        //垂直
        for (int i2 = i; i2 < chars.length; i2++) {
            if (chars[i2][j] == c) {
                System.out.println("char[" + c + "] exist in x" + x + " y" + y);
                x = i2;
                y = j;
                return true;
            }
        }

        System.out.println("char[" + c + "] not exist");
        return false;

    }

}
