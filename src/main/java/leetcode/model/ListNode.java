package leetcode.model;

/**
 * Definition for singly-linked list.
 */
public class ListNode {

  public int val;
  public ListNode next;

  public ListNode() {
  }

  public static ListNode of(int[] array) {
    ListNode listNode = new ListNode();
    ListNode dummy = listNode;
    if (array.length == 0) {
      return null;
    } else {
      listNode.val = array[0];
    }
    for (int i = 1; i < array.length; i++) {
      dummy.next = new ListNode(array[i]);
      dummy = dummy.next;
    }

    return listNode;
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static String getPrettyPrint(ListNode l) {
    String res = "[";
    if (l != null) {
      res = res.concat(l.val + "");
      while (l.next != null) {
        l = l.next;
        res = res.concat(", " + l.val);
      }
    }
    return res + "]";
  }

  @Override
  public String toString() {
    return getPrettyPrint(this);
  }

  public static void main(String[] args) {
    ListNode listNode = ListNode.of(new int[]{});
    System.out.println(ListNode.getPrettyPrint(listNode));
    System.out.println(listNode.toString());
  }
}
