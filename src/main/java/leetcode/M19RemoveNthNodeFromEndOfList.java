package leetcode;

import leetcode.model.ListNode;

public class M19RemoveNthNodeFromEndOfList {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode h1 = dummy;
    ListNode h2 = dummy;
    for (int i = 0; i <= n; i++) {
      h1 = h1.next;
    }

    while (h1 != null) {
      h1 = h1.next;
      h2 = h2.next;
    }

    h2.next = h2.next.next;

    return dummy.next;
  }


  public static void main(String[] args) {
    M19RemoveNthNodeFromEndOfList test = new M19RemoveNthNodeFromEndOfList();
    System.out.println(test.removeNthFromEnd(ListNode.of(new int[]{1, 2, 3, 4, 5}), 2));
    System.out.println(test.removeNthFromEnd(ListNode.of(new int[]{1}), 1));
    System.out.println(test.removeNthFromEnd(ListNode.of(new int[]{1, 2}), 1));
  }

}
