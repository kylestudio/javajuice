package sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadImpl4 implements Runnable {

  @Override
  public void run() {
    System.out.println("Thread: " + Thread.currentThread().getName());
  }

  public static void main(String[] args) {
    ExecutorService pool = Executors.newFixedThreadPool(3);

    for (int i = 0; i < 10; i++) {
//      pool.execute(new ThreadImpl4());
      pool.submit(new ThreadImpl4());
    }

    System.out.println("Main thread name: " + Thread.currentThread().getName());

    pool.shutdown();
  }
}
