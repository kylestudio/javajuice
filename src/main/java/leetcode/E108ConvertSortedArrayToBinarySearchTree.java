package leetcode;

import leetcode.model.TreeNode;
import leetcode.util.BTreePrinter;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * <p>
 * Given an array where elements are sorted in ascending order, convert it to a height balanced
 * BST.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of
 * the two subtrees of every node never differ by more than 1.
 * <p>
 * Example:
 * <p>
 * Given the sorted array: [-10,-3,0,5,9],
 * <p>
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 * <p>
 * 0 / \ -3   9 /   / -10  5
 */
public class E108ConvertSortedArrayToBinarySearchTree {

  public static TreeNode convertArrayToBST(int[] nums) {
    return convertArrayToBST(nums, 0, nums.length - 1);
  }

  public static TreeNode convertArrayToBST(int[] nums, int lo, int hi) {
    if (lo > hi) {
      return null;
    }
    int mid = lo + (hi - lo) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.setLeft(convertArrayToBST(nums, lo, mid - 1));
    root.setRight(convertArrayToBST(nums, mid + 1, hi));
    return root;
  }

  public static void main(String[] args) {
    int[] a = {-10, -3, 0, 5, 9};
    TreeNode treeNode1 = convertArrayToBST(a);
    System.out.println(treeNode1);
    BTreePrinter.printNode(treeNode1);
    int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    TreeNode treeNode2 = convertArrayToBST(b);
    System.out.println(treeNode2);
    BTreePrinter.printNode(treeNode2);
  }
}
