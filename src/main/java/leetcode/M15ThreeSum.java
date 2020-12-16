package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M15ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    if (nums.length <= 3) {
      return res;
    }

    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= 0) {
        break;
      } else {
        int j = i + 1;
        int q = nums.length - 1;
        while (j < q) {
          if (nums[i] + nums[j] + nums[q] == 0) {
            res.add(Arrays.asList(nums[i], nums[j], nums[q]));
            break;
          } else if (nums[i] + nums[j] + nums[q] > 0) {
            q--;
          } else {
            j++;
          }
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] a = {-1, 0, 1, 2, -1, -4};
    M15ThreeSum test = new M15ThreeSum();
    System.out.println(test.threeSum(a));
  }
}
