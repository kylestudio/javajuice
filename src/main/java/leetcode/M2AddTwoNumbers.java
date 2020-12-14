package leetcode;

import leetcode.model.ListNode;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class M2AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode returned = new ListNode();
    ListNode current = returned;
    int carry = 0;
    while (true) {
      int value = carry;
      if (l1 != null) {
        value += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        value += l2.val;
        l2 = l2.next;
      }
      current.val = value % 10;
      carry = value / 10;
      if (l1 != null || l2 != null) {
        current.next = new ListNode();
        current = current.next;
      } else {
        break;
      }
    }
    if (carry > 0) {
      current.next = new ListNode(carry);
    }
    return returned;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    l1.next = (new ListNode(4));
    l1.next.next = (new ListNode(3));

    System.out.println(l1);

    ListNode l2 = new ListNode(5);
    l2.next = (new ListNode(6));
    l2.next.next = (new ListNode(4));
    System.out.println(l2);

    M2AddTwoNumbers m = new M2AddTwoNumbers();
    final ListNode l3 = m.addTwoNumbers(l1, l2);
    System.out.println(l3);
  }
}
