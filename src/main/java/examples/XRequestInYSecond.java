package examples;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class XRequestInYSecond {

  private static final int requestLimit = 5;
  private static final int timeLimit = 2;

  private HashMap<Integer, List<LocalDateTime>> records = new HashMap();


  public boolean rateLimit(int customerId) {

    List<LocalDateTime> timeRecords = records.get(customerId);
    if (timeRecords == null || timeRecords.size() == 0) {
      timeRecords = new ArrayList<>();
    }
    final LocalDateTime now = LocalDateTime.now();
    timeRecords.add(now);

    records.put(customerId, timeRecords);

    final long count = timeRecords.stream().filter(i -> i.isAfter(now.minusSeconds(timeLimit)))
        .count();

    return count <= requestLimit;

    //costormerId -> Map<buckets, count>
    //    costormerId -> credits
    //Map<buckets, count> -> requests for last 5 buckets, if(requests > 100): credits = credits-1;

  }
}
