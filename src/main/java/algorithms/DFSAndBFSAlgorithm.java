package algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import leetcode.model.TreeNode;

/**
 * 经典DFS和BFS实现
 */
public class DFSAndBFSAlgorithm {

  /**
   * Use DFS to generate a array
   */
  public static List DFS(TreeNode root) {
    HashSet<TreeNode> map = new HashSet<>();
    ArrayList<Integer> list = new ArrayList<>();
    recursiveAdd(root, map, list);
    return list;
  }

  public static void recursiveAdd(TreeNode node, HashSet<TreeNode> map, ArrayList<Integer> list) {
    if (node == null) {
      return;
    }
    if (!map.contains(node)) {
      map.add(node);
      list.add(node.getVal());
      recursiveAdd(node.getLeft(), map, list);
      recursiveAdd(node.getRight(), map, list);
    }
  }

  /**
   * Use DFS to generate a array
   */
  public static List BFS(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<>();

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode poll = queue.poll();
      if (poll != null) {
        list.add(poll.getVal());
        queue.add(poll.getLeft());
        queue.add(poll.getRight());
      }
    }

    return list;
  }


  public static void main(String[] args) {
    TreeNode r2 = new TreeNode(1);
    r2.setLeft(new TreeNode(2));
    r2.setRight(new TreeNode(2));
    r2.getLeft().setLeft(new TreeNode(3));
    r2.getLeft().setRight(new TreeNode(4));
    r2.getRight().setLeft(new TreeNode(4));
    r2.getRight().setRight(new TreeNode(3));
    List dfs = DFS(r2);
    System.out.println(dfs);
    List bfs = BFS(r2);
    System.out.println(bfs);

  }
}
