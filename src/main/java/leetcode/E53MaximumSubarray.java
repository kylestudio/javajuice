package leetcode;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class E53MaximumSubarray {

  //optimal proxy sum function
  public static int maxSubArray2(int[] nums) {
    int maxSum = nums[0];
    int sum = 0;
    int minSum = 0;
    for (int num : nums) {
      // prefix Sum
      sum += num;
      // update maxSum
      maxSum = Math.max(maxSum, sum - minSum);
      // update minSum
      minSum = Math.min(minSum, sum);
    }
    return maxSum;
  }

  //dynamic programming
  public static int maxSubArray(int[] nums) {
    int currentMaxSum = nums[0];
    int maxSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      currentMaxSum = Math.max(currentMaxSum + nums[i], nums[i]);
      maxSum = Math.max(maxSum, currentMaxSum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[] a = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}; //[4,-1,2,1] has the largest sum = 6.
    int[] b = new int[]{-1, -2, -3, -4, -5}; //should be -1
    int[] c = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, -5, -5,
        -5}; //[4,-1,2,1] has the largest sum = 6.
    System.out.println("SubArray of a: " + maxSubArray2(a));
    System.out.println("SubArray of b: " + maxSubArray2(b));
    System.out.println("SubArray of c: " + maxSubArray2(c));
    System.out.println("SubArray of a: " + maxSubArray(a));
    System.out.println("SubArray of b: " + maxSubArray(b));
    System.out.println("SubArray of c: " + maxSubArray(c));
  }
}
