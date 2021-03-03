package examples;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Result3BadNumber {

  /*
   * Complete the 'goodSegment' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY badNumbers
   *  2. INTEGER lower
   *  3. INTEGER upper
   */

  public static int goodSegment(List<Integer> badNumbers, int lower, int upper) {

    badNumbers.sort(Comparator.naturalOrder());

    int badIndex = 0;

    for (Integer i : badNumbers) {
      if (i >= lower) {
        badIndex = badNumbers.indexOf(i);
        break;
      }
    }

    int res = 0;
    int tempLength = 0;
    for (int i = lower; i <= upper; i++) {
      if (i == badNumbers.get(badIndex)) {
        res = Math.max(res, tempLength);
        tempLength = 0;
        if (badIndex + 1 < badNumbers.size()) {
          badIndex++;
        }
      } else {
        tempLength++;
      }
    }
    res = Math.max(res, tempLength);
    return res;
  }

}

public class LengthWithNoBadNumber {

  public static void main(String[] args) throws IOException {
    System.out.println(Result3BadNumber.goodSegment(Arrays.asList(5, 4, 2, 15), 4, 10));
    System.out.println(Result3BadNumber.goodSegment(Arrays.asList(8, 6, 20, 12), 1, 30));
    System.out.println(Result3BadNumber.goodSegment(Arrays.asList(1, 2, 3, 4), 1, 4));
  }
}
