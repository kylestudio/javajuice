package leetcode;

import java.util.ArrayList;
import java.util.List;

public class M22GenerateParentheses {

  public List<String> generateParenthesis(int n) {
    final Util util = new Util(n);
    return util.fillList();
  }


  class Util {

    private final List<String> list;
    private final int n;

    public Util(int n) {
      this.list = new ArrayList<>();
      this.n = n;
    }

    private void dfs(int i, int j, String str) {
      if (i == n && j == n) {
        list.add(str);
        return;
      }
      if (i < j) {
        return;
      }
      if (i < n) {
        dfs(i + 1, j, str + "(");
      }
      if (j < n) {
        dfs(i, j + 1, str + ")");
      }
    }

    public List<String> fillList() {
      dfs(0, 0, "");
      return list;
    }
  }

  public static void main(String[] args) {
    M22GenerateParentheses test = new M22GenerateParentheses();
    System.out.println(test.generateParenthesis(3));
  }
}
