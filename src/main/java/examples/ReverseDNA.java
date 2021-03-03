package examples;

import java.io.IOException;
import java.util.HashMap;


class ResultDNA {

  /*
   * Complete the 'dnaComplement' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */

  private static HashMap<Character, Character> map = new HashMap<>();

  static {
    map.put('A', 'T');
    map.put('T', 'A');
    map.put('C', 'G');
    map.put('G', 'C');
  }

  public static String dnaComplement(String s) {
    char[] chars = s.toCharArray();
    char[] res = new char[chars.length];

    for (int i = 0; i < chars.length; i++) {
      res[i] = map.get(chars[chars.length - i - 1]);
    }

    return new String(res);
  }

}

public class ReverseDNA {

  public static void main(String[] args) throws IOException {
    System.out.println(ResultDNA.dnaComplement("ACCGGGTTTT"));
  }
}
