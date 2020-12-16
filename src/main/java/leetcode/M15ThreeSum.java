package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M15ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    if (nums.length < 3) {
      return res;
    }

    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        break;
      } else if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      } else {
        int j = i + 1;
        int q = nums.length - 1;
        while (j < q) {
          if (nums[i] + nums[j] + nums[q] == 0) {
            res.add(Arrays.asList(nums[i], nums[j], nums[q]));
            while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
              j++;
            }
            j++;
            while (q - 1 > 0 && nums[q] == nums[q - 1]) {
              q--;
            }
            q--;
            continue;
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
    int[] a = {-2, 0, 0, 2, 2};
    M15ThreeSum test = new M15ThreeSum();
    System.out.println(test.threeSum(a));
  }
}
