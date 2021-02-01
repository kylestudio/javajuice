package leetcode;

public class Assessment2 {

  public int solution(int number) {
    //TODO: Code stuff here
    int res = 0;
    for (int i = 1; i < number; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        res += i;
      }
    }
    return res;
  }

  public int solution2(int number) {

    int res = 0;
    int a = 3;
    int b = 5;

    while (a < number) {
      res += a;
      a = a + 3;
    }

    while (b < number) {
      res += b;
      b = b + 5;
    }

    return res;
  }

  public String getMiddle(String str) {
    if (str == null) {
      return null;
    }
    if (str == "") {
      return str;
    }

    final int len = str.length();
    if (len % 2 == 0) {
      return str.substring(len / 2 - 1, len / 2 + 1);
    } else {
      return str.substring(len / 2, len / 2 + 1);
    }
  }

  public String markdownParser(String markdown) {

    if (markdown == null) {
      return null;
    }

    while (true) {
      if (markdown.startsWith(" ")) {
        markdown = markdown.substring(1);
      } else {
        break;
      }
    }

    final String[] splited = markdown.split(" ", 2);
    if (splited.length != 2) {
      return markdown;
    }

    while (true) {
      if (splited[1].startsWith(" ")) {
        splited[1] = splited[1].substring(1);
      } else if (splited[1].endsWith(" ")) {
        splited[1] = splited[1].substring(0, splited[1].length() - 1);
      } else {
        break;
      }
    }

    if (splited[0].length() > 6) {
      return markdown;
    }

    //if(!splited[0].equals("#".repeat(splited[0].length()))) {
    //  return markdown;
    //}

    for (int i = 0; i < splited[0].length(); i++) {
      if ('#' != splited[0].charAt(i)) {
        return markdown;
      }
    }

    return "<h" + splited[0].length() + ">" + splited[1] + "</h" + splited[0].length() + ">";
  }

  public static void main(String[] args) {
    Assessment2 test = new Assessment2();
//    System.out.println(test.solution2(200));
//    System.out.println(test.solution(200));
//    System.out.println(test.getMiddle("abcd"));
//    System.out.println(test.getMiddle("abc"));
//    System.out.println(3 / 2);
//    System.out.println(test.markdownParser(null));
//    System.out.println(test.markdownParser(""));
//    System.out.println(test.markdownParser("# header"));
//    System.out.println(test.markdownParser("## smaller header"));
//    System.out.println(test.markdownParser("#Invalid"));
    System.out.println(test.markdownParser("  # Big"));
//    System.out.println(test.markdownParser("####### Snow White and the Seven Hashtags"));
//    System.out.println("#".repeat(3));
  }

}
