package leetcode;

import leetcode.model.ListNode;

public class M24SwapNodesInPairs {

  public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode();
    dummy.next = head;
    ListNode current = dummy;

    while (current != null && current.next != null && current.next.next != null) {
      ListNode first = current.next;
      ListNode second = current.next.next;
      first.next = second.next;
      second.next = first;
      current.next = second;

      current = current.next.next;
    }

    return dummy.next;
  }

  public static void main(String[] args) {
    M24SwapNodesInPairs test = new M24SwapNodesInPairs();
    System.out.println(ListNode.getPrettyPrint(test.swapPairs(ListNode.of(new int[]{1, 2, 3, 4}))));
    System.out.println(ListNode.getPrettyPrint(test.swapPairs(ListNode.of(new int[]{}))));
    System.out.println(ListNode.getPrettyPrint(test.swapPairs(ListNode.of(new int[]{1}))));
  }
}
