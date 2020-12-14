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

        if (l1.val <= l2.val) {
            l1.next = (mergeTwoLists(l1.next, l2));
            return l1;
        } else {
            l2.next = (mergeTwoLists(l1, l2.next));
            return l2;
        }
    }



    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = (new ListNode(2));
        l1.next.next = (new ListNode(5));
        l1.next.next.next = (new ListNode(7));

        System.out.println(l1);

        ListNode l2 = new ListNode(1);
        l2.next = (new ListNode(3));
        l2.next.next = (new ListNode(4));
        l2.next.next.next = (new ListNode(6));
        l2.next.next.next.next = (new ListNode(8));
        System.out.println(l2);

        ListNode l3 = mergeTwoLists(l1, l2);
        System.out.println(l3);
    }
}
