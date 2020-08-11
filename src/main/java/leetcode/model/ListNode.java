package leetcode.model;

/**
 * Definition for singly-linked list.
 */
public class ListNode {

  int val;
  ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
  }

  public ListNode getNext() {
    return next;
  }

  public void setNext(ListNode next) {
    this.next = next;
  }

  private String getPrettyPrint(ListNode l) {
    if (l == null) {
      return null;
    }

    String re = l.getVal() + "";
    while (l.getNext() != null) {
      l = l.getNext();
      re = re.concat(" -> " + l.getVal());
    }
    return re;
  }

  @Override
  public String toString() {
    return getPrettyPrint(this);
  }
}
