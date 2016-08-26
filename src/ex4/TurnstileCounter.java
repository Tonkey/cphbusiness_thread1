package ex4;

import java.util.concurrent.atomic.AtomicInteger;

public class TurnstileCounter {

  static final long DELAY_VAL = 10000;
//  long count = 0;
  AtomicInteger count = new AtomicInteger();
  
  public long getValue() {
    return count.longValue();
  }

  public void incr() {
//   If the program initially does not fail, replace the count line with the lines below
//    long n = count;
//    //Spend some time to force preemtion
//    for(long a=0; a<LockDemo.DELAY_VAL; a++);
//    n = n + 1;
//    count = n;
      count.incrementAndGet();
//    count++;
  }
}
