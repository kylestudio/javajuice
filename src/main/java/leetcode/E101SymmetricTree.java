package leetcode;

import leetcode.model.TreeNode;

/**
 * https://leetcode.com/problems/symmetric-tree/
 * <p>
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * <p>
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * <p>
 * 1 / \ 2   2 / \ / \ 3  4 4  3
 * <p>
 * <p>
 * But the following [1,2,2,null,3,null,3] is not:
 * <p>
 * 1 / \ 2   2 \   \ 3    3
 */
public class E101SymmetricTree {


  public static boolean syn(TreeNode node1, TreeNode node2) {
    if (node1 == null && node2 == null) {
      return true;
    }

    if ((node1 != null && node2 == null) || (node1 == null && node2 != null)) {
      return false;
    }

    if (!node1.getVal().equals(node2.getVal())) {
      return false;
    } else {
      return syn(node1.getLeft(), node2.getRight()) && syn(node1.getRight(), node2.getLeft());
    }
  }

  public static boolean isSymmetric(TreeNode root) {

    return syn(root.getLeft(), root.getRight());
  }

  public static void main(String[] args) {
    TreeNode r1 = new TreeNode();
    System.out.println("r1 symmetric: " + isSymmetric(r1));
    TreeNode r2 = new TreeNode(1);
    r2.setLeft(new TreeNode(2));
    r2.setRight(new TreeNode(2));
    r2.getLeft().setLeft(new TreeNode(3));
    r2.getLeft().setRight(new TreeNode(4));
    r2.getRight().setLeft(new TreeNode(4));
    r2.getRight().setRight(new TreeNode(3));
    System.out.println("r2 symmetric: " + isSymmetric(r2));
    TreeNode r3 = new TreeNode(1);
    r3.setLeft(new TreeNode(2));
    r3.setRight(new TreeNode(2));
    r3.getLeft().setRight(new TreeNode(3));
    r3.getRight().setRight(new TreeNode(3));
    System.out.println("r3 symmetric: " + isSymmetric(r3));
  }

}
