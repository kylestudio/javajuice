package sample;

public class UnreentrantLock {

  private boolean isLocked = false;

  public synchronized void lock() throws InterruptedException {
    System.out.println("Enter lock process: " + Thread.currentThread().getName());

    while (isLocked) {
      System.out.printf(
          "The entity is locked, this thread will wait " + Thread.currentThread().getName());
      wait();
    }

    isLocked = true;
  }

  public synchronized void unLock() {
    System.out.println("Enter unlock process " + Thread.currentThread().getName());
    isLocked = false;
    notify();
  }

  public static void main(String[] args) {
    UnreentrantLock unreentrantLock = new UnreentrantLock();
    try {
      unreentrantLock.lock(); //first get it locked
      unreentrantLock.lock(); //lock it again
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      unreentrantLock.unLock();
    }
  }
}
