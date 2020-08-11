package leetcode;

import leetcode.model.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class E104MaximumDepthOfBinaryTree {

  public static int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.getLeft() == null && root.getRight() == null) {
      return 1;
    }

    return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
  }

  public static void main(String[] args) {
    TreeNode r1 = new TreeNode();
    System.out.println("r1 depth: " + maxDepth(r1));
    TreeNode r2 = new TreeNode(1);
    r2.setLeft(new TreeNode(2));
    r2.setRight(new TreeNode(2));
    r2.getLeft().setLeft(new TreeNode(3));
    r2.getLeft().setRight(new TreeNode(4));
    r2.getRight().setLeft(new TreeNode(4));
    r2.getRight().setRight(new TreeNode(3));
    r2.getRight().getRight().setRight(new TreeNode(3));
    System.out.println("r2 depth: " + maxDepth(r2));
    TreeNode r3 = new TreeNode(1);
    r3.setLeft(new TreeNode(2));
    r3.setRight(new TreeNode(2));
    r3.getLeft().setRight(new TreeNode(3));
    r3.getRight().setRight(new TreeNode(3));
    System.out.println("r3 depth: " + maxDepth(r3));
  }
}
