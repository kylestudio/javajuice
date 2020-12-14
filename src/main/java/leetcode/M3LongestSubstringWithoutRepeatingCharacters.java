package leetcode;

import java.util.HashMap;

public class M3LongestSubstringWithoutRepeatingCharacters {

  public int lengthOfLongestSubstring(String s) {
    int start = 0;
    int length = 0;
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.containsKey(c)) {
        int x = map.get(c);
        if (start < x + 1) {
          start = x + 1;
        }
      }
      length = Math.max(length, i - start + 1);
      map.put(c, i);

    }
    return length;
  }

  public static void main(String[] args) {
    String s = "asdfghjklqwertyuaiopzxcvbnm";
    M3LongestSubstringWithoutRepeatingCharacters test = new M3LongestSubstringWithoutRepeatingCharacters();
    System.out.println(test.lengthOfLongestSubstring(s));
  }
}
