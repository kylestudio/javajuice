package sample;

public class ReentrantLock {

  private boolean isLocked = false;
  private int lockedCount = 0;
  private Thread lockedOwner = null;

  public synchronized void lock() throws InterruptedException {
    System.out.println("Enter lock process: " + Thread.currentThread().getName());

    while (isLocked && lockedOwner != Thread.currentThread()) {
      System.out.printf(
          "The entity is locked, this thread will wait " + Thread.currentThread().getName());
      System.out.println("isLocked = " + isLocked);
      System.out.println("lockedCount =  " + lockedCount);
      wait();
    }

    lockedCount++;
    lockedOwner = Thread.currentThread();
    isLocked = true;
  }

  public synchronized void unLock() {
    System.out.println("Enter unlock process " + Thread.currentThread().getName());
    if (Thread.currentThread() == lockedOwner) {
      lockedCount--;
      if (lockedCount == 0) {

        isLocked = false;
        lockedOwner = null;
        notify();
      }

    } else {
      System.out.printf("Invalid thread to unlock: " + Thread.currentThread().getName());
    }
  }

  public static void main(String[] args) {
    ReentrantLock reentrantLock = new ReentrantLock();
    try {
      reentrantLock.lock(); //first get it locked
      reentrantLock.lock(); //lock it again
      reentrantLock.lock(); //lock it again
      reentrantLock.lock(); //lock it again
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      reentrantLock.unLock();
    }
  }
}
