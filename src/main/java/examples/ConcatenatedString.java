package examples;

class Result2 {

  public static boolean isRepeat(String s, String t) {
    String dummyT = t;
    while (dummyT.length() <= s.length()) {
      if (s.equals(dummyT)) {
        return true;
      }
      dummyT = dummyT + t;
    }
    return false;
  }

  public static int getRepeatNum(String s, String t) {

    if (isRepeat(s, t)) {
      return 1;
    } else {
      return -1;
    }
  }
}

public class ConcatenatedString {

  public static void main(String[] args) {
    System.out.println(Result2.getRepeatNum("bcdbcdbcdbcd", "bcdbcd"));
    System.out.println(Result2.getRepeatNum("bcdbcdbcd", "bcdbcd"));
  }
}
