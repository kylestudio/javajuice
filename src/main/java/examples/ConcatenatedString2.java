package examples;

class Result3 {

  public static boolean isConcat(String s, String t) {

    int sLength = s.length();
    int tLength = t.length();
    if (sLength % tLength != 0) {
      return false;
    }

    for (int i = 0; i < sLength; i++) {
      if (s.charAt(i) != t.charAt(i % tLength)) {
        return false;
      }
    }

    return true;
  }

  public static int concat(String s, String t) {

    if (isConcat(s, t)) {
      for (int i = 1; i <= t.length() / 2 + 1; i++) {
        String temp = t.substring(0, i);
        if (isConcat(t, temp)) {
          return temp.length();
        }
      }

      return t.length();
    } else {
      return -1;
    }
  }
}

public class ConcatenatedString2 {

  public static void main(String[] args) {
    System.out.println(Result3.concat("bcdbcdbcdbcd", "bcdbcd"));
    System.out.println(Result3.concat("bcdbcdbcd", "bcdbcd"));
    System.out.println(Result3.concat("bcdb", "bcdb"));
  }
}
