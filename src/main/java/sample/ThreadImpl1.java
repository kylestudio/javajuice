package sample;

public class ThreadImpl1 extends Thread {

  @Override
  public void run() {
    System.out.println("Thread: " + Thread.currentThread().getName());
  }

  public static void main(String[] args) {
    ThreadImpl1 t = new ThreadImpl1();
    t.setName("demo1");
    t.start();
    System.out.println("Main thread name: " + Thread.currentThread().getName());
  }
}


