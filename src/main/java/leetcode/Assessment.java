package leetcode;

public class Assessment {

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

  public static void main(String[] args) {
    Assessment test = new Assessment();
    System.out.println(test.solution2(200));
    System.out.println(test.solution(200));
  }

}
