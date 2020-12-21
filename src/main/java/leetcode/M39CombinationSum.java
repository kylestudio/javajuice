package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M39CombinationSum {

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(candidates);
    combine(candidates, target, res, new ArrayList<Integer>(), 0);
    return res;
  }

  public void combine(int[] candidates, int target, List<List<Integer>> res, List<Integer> temp,
      int index) {

    if (target < 0) {
      return;
    }
    if (target == 0) {
      res.add(List.copyOf(temp));
      return;
    }
    for (int i = index; i < candidates.length; i++) {
      temp.add(candidates[i]);
      combine(candidates, target - candidates[i], res, temp, i);
      temp.remove(Integer.valueOf(candidates[i]));
    }
  }

  public static void main(String[] args) {
    M39CombinationSum test = new M39CombinationSum();
    System.out.println(test.combinationSum(new int[]{2, 3, 6, 7}, 7));
    System.out.println(test.combinationSum(new int[]{1}, 1));
    System.out.println(test.combinationSum(new int[]{2, 3, 5}, 8));
  }
}
