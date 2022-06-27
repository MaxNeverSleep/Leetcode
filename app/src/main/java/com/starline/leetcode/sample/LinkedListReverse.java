package com.starline.leetcode.sample;


/**
 * 链表反转
 *
 * @author jianyu.yang
 * @date 2022/5/23
 **/
public class LinkedListReverse {

    public static void main(String... args) {
        ListNode last = new ListNode(9, null);
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(0, new ListNode(5, new ListNode(8, last)))));
        reverse(l2);

    }

    public static void reverse(ListNode startNode) {
        ListNode next = startNode.next;
        ListNode prev = startNode;
        ListNode last;
        do {
            last = next.next;
            next.next = prev;
            prev = next;
            next = last;
        } while (last != null);
        startNode.next = null;
    }


    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
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
