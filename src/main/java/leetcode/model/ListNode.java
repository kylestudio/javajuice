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
      return listNode;
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

  private String getPrettyPrint(ListNode l) {
    if (l == null) {
      return null;
    }

    String re = l.val + "";
    while (l.next != null) {
      l = l.next;
      re = re.concat(" -> " + l.val);
    }
    return re;
  }

  @Override
  public String toString() {
    return getPrettyPrint(this);
  }
}
