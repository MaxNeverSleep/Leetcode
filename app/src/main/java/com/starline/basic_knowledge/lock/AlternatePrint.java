package com.starline.basic_knowledge.lock;

/**
 * @author jianyu.yang
 * @date 2022/5/23
 **/
public class AlternatePrint {

    public static int value = 0;

    public static void main(String... args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (AlternatePrint.class) {
                    try {
                        while (value < 3000) {
                            value++;
                            System.out.println("Value= " + value + " Thread = " + Thread.currentThread().getName());
                            AlternatePrint.class.notify();
                            AlternatePrint.class.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("thread 1 finish");
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (AlternatePrint.class) {
                    try {
                        while (value < 3000) {
                            value++;
                            System.out.println("Value= " + value + " Thread = " + Thread.currentThread().getName());
                            AlternatePrint.class.notify();
                            AlternatePrint.class.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("thread 2 finish");
                }
            }
        });

        t1.start();
        t2.start();
    }


}
