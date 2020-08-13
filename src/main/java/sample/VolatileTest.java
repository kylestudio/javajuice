package sample;

/**
 * 测试股volatile的原子性保障
 */

public class VolatileTest {

  static class A {

    //    volatile int a = 0;
    int a = 0;

    synchronized void increase() {
      a++;
    }

    int getA() {
      return a;
    }
  }

  public static void main(String[] args) {
    A a = new A();

    new Thread(() -> {
      for (int i = 0; i < 10000; i++) {
        a.increase();
      }
      System.out.println(a.getA());
    }).start();
    new Thread(() -> {
      for (int i = 0; i < 20000; i++) {
        a.increase();
      }
      System.out.println(a.getA());
    }).start();
    new Thread(() -> {
      for (int i = 0; i < 30000; i++) {
        a.increase();
      }
      System.out.println(a.getA());
    }).start();
    new Thread(() -> {
      for (int i = 0; i < 40000; i++) {
        a.increase();
      }
      System.out.println(a.getA());
    }).start();
    new Thread(() -> {
      for (int i = 0; i < 50000; i++) {
        a.increase();
      }
      System.out.println(a.getA());
    }).start();
  }
}
