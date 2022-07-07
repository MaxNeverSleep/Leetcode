package com.starline.basic_knowledge.algorithm.leetcode;

/**
 * @author jianyu.yang
 * @date 2022/4/3
 **/
public class Question2 {

    public static void main(String[] args) {

        new Question2().addTwoNumbers(null, null);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

//        l1 = new ListNode(9, null);
//        l2 = new ListNode(1,
//                new ListNode(9,
//                        new ListNode(9,
//                                new ListNode(9,
//                                        new ListNode(9,
//                                                new ListNode(9,
//                                                        new ListNode(9,
//                                                                new ListNode(9,
//                                                                        new ListNode(9,
//                                                                                new ListNode(9, null))))))))));
//
//        l1 = new ListNode(9,
//                new ListNode(9,
//                        new ListNode(9,
//                                new ListNode(9,
//                                        new ListNode(9,
//                                                new ListNode(9,
//                                                        new ListNode(9, null)))))));
//        l2 = new ListNode(9,
//                new ListNode(9,
//                        new ListNode(9,
//                                new ListNode(9, null))));


        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode last = null;
        ListNode first = null;
        boolean needCarryOn = false;
        while (true) {
            int value = 0;
            if (temp1 != null) {
                value += temp1.val;
            }
            if (temp2 != null) {
                value += temp2.val;
            }
            if (needCarryOn) {
                value = value + 1;
                needCarryOn = false;
            }
            if (value >= 10) {
                value = value - 10;
                needCarryOn = true;
            }

            ListNode current = new ListNode(value, null);
            if (last != null) {
                last.next = current;
            } else {
                first = current;
            }
            last = current;
            //如果两个链表都无下一个节点，跳出
            if ((temp1 == null || temp1.next == null) && (temp2 == null || temp2.next == null)) {
                if (needCarryOn) {
                    last.next = new ListNode(1, null);
                }
                break;
            }
            if (temp1 != null) {
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }

        return first;
    }


//
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
////        l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
////        l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
////
////        l1 = new ListNode(9, null);
////        l2 = new ListNode(1,
////                new ListNode(9,
////                        new ListNode(9,
////                                new ListNode(9,
////                                        new ListNode(9,
////                                                new ListNode(9,
////                                                        new ListNode(9,
////                                                                new ListNode(9,
////                                                                        new ListNode(9,
////                                                                                new ListNode(9, null))))))))));
//
//        l1 = new ListNode(9,
//                new ListNode(9,
//                        new ListNode(9,
//                                new ListNode(9,
//                                        new ListNode(9,
//                                                new ListNode(9,
//                                                        new ListNode(9, null)))))));
//        l2 = new ListNode(9,
//                new ListNode(9,
//                        new ListNode(9,
//                                new ListNode(9, null))));
//
//
//        ListNode temp = l1;
//        Queue<Integer> result1 = new LinkedBlockingQueue<>();
//        while (true) {
//            System.out.println("l1 value =" + temp.val);
//            result1.offer(temp.val);
//            if (temp.next == null) {
//                break;
//            }
//            temp = temp.next;
//        }
//
//        temp = l2;
//        Queue<Integer> result2 = new LinkedBlockingQueue<>();
//        while (true) {
//            System.out.println("l2 value =" + temp.val);
//            result2.offer(temp.val);
//            if (temp.next == null) {
//                break;
//            }
//            temp = temp.next;
//        }
//
//
//        ListNode first = null;
//        ListNode prev = null;
//        boolean needCarryOver = false;
//        while (true) {
//            int value = 0;
//            if (needCarryOver) {
//                value += 1;
//                needCarryOver = false;
//            }
//            if (result1.size() != 0) {
//                System.out.println("result1 =" + result1.peek());
//                value += result1.poll();
//            }
//            if (result2.size() != 0) {
//                System.out.println("result2 =" + result2.peek());
//                value += result2.poll();
//            }
//            if (value >= 10) {
//                value = value % 10;
//                needCarryOver = true;
//            }
//            ListNode current = new ListNode(value, null);
//            if (prev != null) {
//                prev.next = current;
//            } else {
//                first = current;
//            }
//            System.out.println("value" + value);
//            prev = current;
//            if (result1.size() == 0 && result2.size() == 0) {
//                if (needCarryOver) {
//                    current.next = new ListNode(1, null);
//                }
//                break;
//            }
//        }
//
//        return first;
//    }

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


}
