package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 * <p>
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume
 * that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
 * Example:
 * <p>
 * Input: nums1 = [1,2,3,0,0,0], m = 3 nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -10^9 <= nums1[i], nums2[i] <= 10^9 nums1.length == m + n nums2.length == n
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
