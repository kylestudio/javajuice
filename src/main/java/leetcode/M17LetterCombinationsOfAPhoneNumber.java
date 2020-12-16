package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class M17LetterCombinationsOfAPhoneNumber {


  private static HashMap<Integer, List<String>> map = new HashMap<>();

  static {
    map.put(2, Arrays.asList("a", "b", "c"));
    map.put(3, Arrays.asList("d", "e", "f"));
    map.put(4, Arrays.asList("g", "h", "i"));
    map.put(5, Arrays.asList("j", "k", "l"));
    map.put(6, Arrays.asList("m", "n", "o"));
    map.put(7, Arrays.asList("p", "q", "r", "s"));
    map.put(8, Arrays.asList("t", "u", "v"));
    map.put(9, Arrays.asList("w", "x", "y", "z"));
  }

  public List<String> letterCombinations(String digits) {
    if (digits == null || digits.length() == 0) {
      return new ArrayList<>();
    }

    if (digits.length() == 1) {
      return map.get(Integer.parseInt(digits));
    }

    return genList(digits.charAt(0), digits.substring(1));
  }

  private List<String> genList(char a, String digits) {
    if (digits.length() == 1) {
      return mergeList(map.get(Character.getNumericValue(a)),
          map.get(Character.getNumericValue(digits.charAt(0))));
    } else {
      return mergeList(map.get(Character.getNumericValue(a)),
          genList(digits.charAt(0), digits.substring(1)));
    }
  }

  private List<String> mergeList(List<String> a, List<String> b) {
    List<String> returnedList = new ArrayList<>();
    for (String i : a) {
      for (String j : b) {
        returnedList.add(i + j);
      }
    }
    return returnedList;
  }

  public static void main(String[] args) {
    String a = "23";
    M17LetterCombinationsOfAPhoneNumber test = new M17LetterCombinationsOfAPhoneNumber();
    System.out.println(test.letterCombinations(a));
  }
}
