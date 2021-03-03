package examples;

import java.time.LocalDateTime;
import java.util.HashMap;

public class XRequestInYSecond2 {

  class RequestInfo {

    int requestNum;
    LocalDateTime startTime;

    public RequestInfo(LocalDateTime startTime) {
      this.startTime = startTime;
      this.requestNum = 1;
    }

    public RequestInfo count() {
      this.requestNum = this.requestNum + 1;
      return this;
    }

    public RequestInfo reset(LocalDateTime startTime) {
      this.startTime = startTime;
      this.requestNum = 1;
      return this;
    }

    public int getRequestNum() {
      return requestNum;
    }

    public LocalDateTime getStartTime() {
      return startTime;
    }
  }

  private static final int requestLimit = 10;
  private static final int timeLimit = 5;

  private HashMap<Integer, RequestInfo> records = new HashMap();


  public boolean rateLimit(int customerId) {

    LocalDateTime now = LocalDateTime.now();
    RequestInfo requestInfo = records.get(customerId);

    if (requestInfo == null) {
      requestInfo = new RequestInfo(now);
      records.put(customerId, requestInfo);
      return true;
    } else {

      if (now.isAfter(requestInfo.getStartTime().plusSeconds(timeLimit))) {
        requestInfo.reset(now);
        return true;
      } else {
        requestInfo.count();
        return requestInfo.getRequestNum() <= requestLimit;
      }
    }


  }
}
