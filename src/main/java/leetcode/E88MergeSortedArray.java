package leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class E88MergeSortedArray {

  public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
    int current = m + n - 1;
    while (current >= 0) {

      if (n == 0) {
        return nums1;
      }

      if (m < 1) {
        nums1[current] = nums2[n - 1];
        n--;
        current--;
        continue;
      }

      if (n < 1) {
        nums1[current] = nums1[m - 1];
        m--;
        current--;
        continue;
      }

      if (nums1[m - 1] > nums2[n - 1]) {
        nums1[current] = nums1[m - 1];
        m--;
      } else {
        nums1[current] = nums2[n - 1];
        n--;
      }
      current--;

    }

    return nums1;
  }

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int m = 3;
    int[] nums2 = {2, 5, 6};
    int n = 3;
    int[] merge = merge(nums1, m, nums2, n);
    System.out.println("merge: " + Arrays.toString(merge));
  }
}
