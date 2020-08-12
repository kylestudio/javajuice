package sample;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadImpl3 implements Callable {

  @Override
  public Object call() throws Exception {
    System.out.println("Thread: " + Thread.currentThread().getName());
    return null;
  }

  public static void main(String[] args) {
    ThreadImpl3 t3 = new ThreadImpl3();
    FutureTask f = new FutureTask(t3);
    Thread t = new Thread(f);
    t.setName("demo3");
    t.start();
    System.out.println("Main thread name: " + Thread.currentThread().getName());
  }
}
