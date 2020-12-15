package leetcode;

public class M5LongestPalindromicSubstring {

  public String longestPalindrome(String s) {
    if (s == null || s.length() == 0) {
      return "";
    }

    String res = s.substring(0, 1);
    boolean[][] dp = new boolean[s.length()][s.length()];
    for (int i = s.length() - 1; i >= 0; i--) {
      for (int j = i; j <= s.length() - 1; j++) {
        if (j == i) {
          dp[i][j] = true;
        } else if (j - i == 1) {
          dp[i][j] = s.charAt(i) == s.charAt(j);
        } else {
          dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
        }

        if (dp[i][j] && j - i + 1 > res.length()) {
          res = s.substring(i, j + 1);
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    String s = "asdasdfghjkjhgfdsaasd";
    M5LongestPalindromicSubstring test = new M5LongestPalindromicSubstring();
    System.out.println("--->: " + test.longestPalindrome(s));
  }
}
