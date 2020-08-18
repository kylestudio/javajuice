package sample;

public class DeadLock1 {

  private String a = "a";
  private String b = "b";

  public void methodA() {

    //get lock A
    synchronized (a) {
      System.out.println("This is method A with lock A " + Thread.currentThread().getName());

      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      synchronized (b) {
        System.out.println("This is method A to get lock B" + Thread.currentThread().getName());
      }

    }


  }

  public void methodB() {

    //get lock B
    synchronized (b) {
      System.out.println("This is method B with lock B " + Thread.currentThread().getName());

      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      synchronized (a) {
        System.out.println("This is method B to get lock A" + Thread.currentThread().getName());
      }

    }


  }

  public static void main(String[] args) {
    System.out.println("Main thread start: " + Thread.currentThread().getName());

    DeadLock1 deadLock1 = new DeadLock1();
    new Thread(() -> {
      deadLock1.methodA();
    }).start();

    new Thread(() -> {
      deadLock1.methodB();
    }).start();

    System.out.println("Main thread end: " + Thread.currentThread().getName());
  }
}
