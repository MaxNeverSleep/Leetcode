package com.starline.basic_knowledge.algorithm.sample;

/**
 * 一个12小时的表盘上，找出时钟表盘上时针和分钟夹角为6度的时刻，
 * 注意分针每走一分钟，时针的位置都会发生微小的改变，
 * 表盘上分针只有整数，只需要考虑整数分钟的场景
 * 例如：12点整，时针分钟夹角0度，12点零1分是5.5度
 *
 * @author jianyu.yang
 * @date 2022/4/26
 **/
public class ClockAngle {


    public static void main(String[] args) {
        getTimeByAngle(6);
    }


    /**
     * 1分6度 1小时 30度  0.5度
     */
    public static void getTimeByAngle(double angle) {
        double hourAngle;
        double minAngle;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j <= 60; j++) {
                hourAngle = i * 30 + j * 0.5;
                minAngle = j * 6;
                if (Math.abs(hourAngle - minAngle) == angle) {
                    System.out.println("i=" + i + " j=" + j);
                }
            }
        }
    }


}
