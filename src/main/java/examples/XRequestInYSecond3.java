package examples;

import java.util.HashMap;

public class XRequestInYSecond3 {

  /**
   * Imagine we are building an application that is used by many different customers. We want to
   * avoid one customer being able to overload the system by sending too many requests, so we
   * enforce a per-customer rate limit. The rate limit is defined as:
   * <p>
   * “Each customer can make X requests per Y seconds”
   * <p>
   * Assuming that customer ID is extracted somehow from the request, implement the following
   * function.
   * <p>
   * <p>
   * boolean rateLimit(int customerId)
   */

  private static final int maxRequest = 10;
  private static final int timeInterval = 5000;


  private static HashMap<Integer, HashMap<Long, Integer>> records = new HashMap<>();

  boolean rateLimit(int customerId) {
    HashMap<Long, Integer> bucketMap = records.get(customerId);

    final long nowSecond = System.currentTimeMillis();
    final long bucketId = nowSecond / timeInterval;

    if (bucketMap == null) {
      bucketMap = new HashMap();
      bucketMap.put(bucketId, 1);
      records.put(customerId, bucketMap);
      return true;
    } else {
      Integer requestNum = bucketMap.get(bucketId);
      if (requestNum == null) {
        bucketMap.put(bucketId, 1);
        return true;
      } else {
        requestNum++;
        bucketMap.put(bucketId, requestNum);
        return requestNum <= maxRequest;
      }
    }
  }
}
