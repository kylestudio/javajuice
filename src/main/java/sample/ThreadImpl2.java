package sample;

public class ThreadImpl2 implements Runnable {

  @Override
  public void run() {
    System.out.println("Thread: " + Thread.currentThread().getName());
  }

  public static void main(String[] args) {
    Thread thread = new Thread(new ThreadImpl2());
    thread.setName("demo2");
    thread.start();
    System.out.println("Main thread name: " + Thread.currentThread().getName());
  }
}
