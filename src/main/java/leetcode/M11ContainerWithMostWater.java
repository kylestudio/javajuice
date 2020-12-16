package leetcode;

public class M11ContainerWithMostWater {

  public int maxArea(int[] height) {
    if (height.length <= 1) {
      return 0;
    }

    int left = 0;
    int right = height.length - 1;
    int max = 0;
    while (left < right) {
      int volume = (right - left) * Math.min(height[left], height[right]);
      if (volume > max) {
        max = volume;
      }
      if (height[left] > height[right]) {
        right--;
      } else {
        left++;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] a = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    M11ContainerWithMostWater test = new M11ContainerWithMostWater();
    System.out.println(test.maxArea(a));
  }
}
