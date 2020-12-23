package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class M46Permutations {

  public List<List<Integer>> permute(int[] nums) {
    if (nums.length == 0) {
      return new ArrayList<>();
    }
    if (nums.length == 1) {
      List<List<Integer>> res = new ArrayList<>();
      res.add(new ArrayList<>(Arrays.asList(nums[0])));
      return res;
    }

    List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
    int value = numsList.get(0);
    numsList.remove(0);
    return gen(value, numsList);
  }

  private List<List<Integer>> gen(int value, List<Integer> nums) {

    if (nums.size() == 1) {
      int b = nums.get(0);
      List<List<Integer>> res = new ArrayList<>();
      res.add(new ArrayList<>(Arrays.asList(value, b)));
      res.add(new ArrayList<>(Arrays.asList(b, value)));
      return res;
    } else {
      int next = nums.get(0);
      nums.remove(0);
      return expand(value, gen(next, nums));
    }
  }

  private List<List<Integer>> expand(int value, List<List<Integer>> list) {

    List<List<Integer>> returnedList = new ArrayList<>();

    for (List<Integer> listItem : list) {
      for (int i = 0; i <= listItem.size(); i++) {
        List<Integer> temp = new ArrayList<>(List.copyOf(listItem));
        temp.add(i, value);
        returnedList.add(temp);
      }
    }

    return returnedList;
  }

  public static void main(String[] args) {
    M46Permutations test = new M46Permutations();
    System.out.println(test.permute(new int[]{1, 2, 3}));
    System.out.println(test.permute(new int[]{1, 2, 3, 4}));
    System.out.println(test.permute(new int[]{1}));
  }
}
