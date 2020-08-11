package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class E26RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slowP = 0;
        for (int fastP = 0; fastP < nums.length; fastP++) {
            if (nums[fastP] != nums[slowP]) {
                slowP++;
                nums[slowP] = nums[fastP];
            }
        }
        System.out.println(Arrays.toString(nums));
        return slowP + 1;
    }

    public static void main(String[] args) {
        int a = removeDuplicates(new int[]{});
        System.out.println(a);

        int b = removeDuplicates(
            new int[]{1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 7, 7, 7, 8});
        System.out.println(b);
    }
}
