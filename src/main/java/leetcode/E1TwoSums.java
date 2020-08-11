package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific
 * target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */
public class E1TwoSums {

    public static int[] twoSums(int[] nums, int target) {

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(target - nums[i])) {
                return new int[]{m.get(target - nums[i]), i};
            } else {
                m.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7, 8, 9};
        int target = 15;
        int[] ints = twoSums(a, target);
        System.out.println("ints: [" + ints[0] + " " + ints[1] + "]");

    }
}


