package leetcode;

import java.util.Arrays;

public class M1658MinimumOperationsToReduceXToZero2 {

  public int minOperations(int[] nums, int x) {

    int sum = Arrays.stream(nums).sum();
    int windowSize = sum - x;
    if (windowSize == 0) {
      return nums.length;
    }
    int left = 0;
    int right = 0;
    int win = 0;
    int res = nums.length;
    while (right < nums.length) {
      win += nums[right];

      while (left < right && win > windowSize) {
        win -= nums[left];
        left++;
      }

      if (win == windowSize) {
        res = Math.min(res, nums.length - (right - left + 1));
      }
      right++;
    }
    return res == nums.length ? -1 : res;
  }

  public static void main(String[] args) {
    M1658MinimumOperationsToReduceXToZero2 test = new M1658MinimumOperationsToReduceXToZero2();
    System.out.println(test.minOperations(
        new int[]{8828, 9581, 49, 9818, 9974, 9869, 9991, 10000, 10000, 10000, 9999, 9993, 9904,
            8819, 1231, 6309}, 134365));
    System.out.println(test.minOperations(new int[]{1, 1, 4, 2, 3}, 5));
    System.out.println(test.minOperations(new int[]{5, 6, 7, 8, 9}, 4));
    System.out.println(test.minOperations(new int[]{3, 2, 20, 1, 1, 3}, 10));
    System.out.println(test.minOperations(new int[]{1, 1}, 3));
    System.out.println(test.minOperations(
        new int[]{1241, 8769, 9151, 3211, 2314, 8007, 3713, 5835, 2176, 8227, 5251, 9229, 904, 1899,
            5513, 7878, 8663, 3804, 2685, 3501, 1204, 9742, 2578, 8849, 1120, 4687, 5902, 9929,
            6769, 8171, 5150, 1343, 9619, 3973, 3273, 6427, 47, 8701, 2741, 7402, 1412, 2223, 8152,
            805, 6726, 9128, 2794, 7137, 6725, 4279, 7200, 5582, 9583, 7443, 6573, 7221, 1423, 4859,
            2608, 3772, 7437, 2581, 975, 3893, 9172, 3, 3113, 2978, 9300, 6029, 4958, 229, 4630,
            653, 1421, 5512, 5392, 7287, 8643, 4495, 2640, 8047, 7268, 3878, 6010, 8070, 7560, 8931,
            76, 6502, 5952, 4871, 5986, 4935, 3015, 8263, 7497, 8153, 384, 1136}, 894887480));
  }
}
