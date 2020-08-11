package leetcode;

import leetcode.model.ListNode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * <p>
 * Merge two sorted linked lists and return it as a new sorted list. The new list should be made by
 * splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4
 */
public class E21MergeTwoSortedLists {


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = new ListNode();

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.getVal() <= l2.getVal()) {
            l1.setNext(mergeTwoLists(l1.getNext(), l2));
            return l1;
        } else {
            l2.setNext(mergeTwoLists(l1, l2.getNext()));
            return l2;
        }
    }



    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.setNext(new ListNode(2));
        l1.getNext().setNext(new ListNode(5));
        l1.getNext().getNext().setNext(new ListNode(7));

        System.out.println(l1);

        ListNode l2 = new ListNode(1);
        l2.setNext(new ListNode(3));
        l2.getNext().setNext(new ListNode(4));
        l2.getNext().getNext().setNext(new ListNode(6));
        l2.getNext().getNext().getNext().setNext(new ListNode(8));
        System.out.println(l2);

        ListNode l3 = mergeTwoLists(l1, l2);
        System.out.println(l3);
    }
}
