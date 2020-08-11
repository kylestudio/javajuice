package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
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


