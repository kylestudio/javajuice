package leetcode;

public class M33SearchInRotatedSortedArray {

  public int search(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {

      int mid = start + (end - start) / 2;

      if (nums[mid] == target) {
        return mid;
      }
      //nums[mid] < nums[start]: mid to end is ordered
      //else start to mid is ordered
      if (nums[mid] < nums[start]) {
        if (target >= nums[mid] && target <= nums[end]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      } else {
        if (target >= nums[start] && target <= nums[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    M33SearchInRotatedSortedArray test = new M33SearchInRotatedSortedArray();
    System.out.println(test.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4));
    System.out.println(test.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    System.out.println(test.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    System.out.println(test.search(new int[]{1}, 3));
  }
}
