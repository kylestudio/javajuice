package examples;/* Problem Name is &&& HashMap &&& PLEASE DO NOT REMOVE THIS LINE. */

/**
 * Instructions to candidate. 1) Run this code in the REPL to observe its behaviour. The execution
 * entry point is main(). 2) Consider adding some additional tests in doTestsPass(). 3) Implement
 * MyHashMap correctly. 4) If time permits, some possible follow-ups.
 */

import java.util.Objects;
import java.util.stream.IntStream;

public class HashMapImpl {


  private class ListNode<K, V> {

    public K key;
    public V value;
    public ListNode<K, V> next;


    public ListNode() {
    }

    public void setKey(K key) {
      this.key = key;
    }

    public void setValue(V value) {
      this.value = value;
    }

    public void setNext(ListNode<K, V> node) {
      this.next = node;
    }

    public K getKey() {
      return this.key;
    }

    public V getValue() {
      return this.value;
    }

    public ListNode<K, V> getNext() {
      return this.next;
    }
  }

  private ListNode[] array = new ListNode[256];


  private int hash(Object key) {
    int hashValue = Objects.hashCode(key);
    int res = hashValue % 256;
    return res;
  }


  /**
   * class MyHashMap
   * <p>
   * Associates a key-value pair in memory such that lookups and inserts can be performed in O(1)
   * time for a reasonably small set of data, and scales linearly (at worst) for larger sets of
   * key-value pairs.
   * <p>
   * Each unique key is associated with one single value.
   */
  private class MyHashMap<K, V> {

    String str;

    MyHashMap() {
    }

    void put(K key, V value) {

      final IntStream chars = str.chars();
      int hash = hash(key);

      if (array[hash] == null) {
        array[hash] = new ListNode();
      }

      ListNode node = findListNodeForKey(array[hash], key);

      if (node.getKey() == null) {
        node.setKey(key);
        node.setValue(value);

      } else {
        node.setValue(value);
      }
    }

    V get(K key) {
      int hash = hash(key);

      ListNode<K, V> node = findListNodeForKey(array[hash], key);
      if (node.getKey() == null) {
        return null;
      } else {
        return (V) node.getValue();
      }
    }

    private ListNode<K, V> findListNodeForKey(ListNode node, K key) {
      if (node == null) {
        return null;
      }

      if (node.getKey() == key) {
        return node;
      } else {
        if (node.getNext() == null) {
          node.setNext(new ListNode());
          return node.getNext();
        }

        return findListNodeForKey(node.getNext(), key);
      }
    }
  }

  /**
   * bool doTestsPass() Runs various tests. Returns true if tests pass. Otherwise, returns false.
   */
  public void doTestsPass() {
    // todo: implement more tests, please
    // feel free to make testing more elegant
    int[][] testCases = {{1, 2}, {3, 4}, {5, 6}};
    boolean passed = true;

    MyHashMap<Integer, Integer> map = new MyHashMap<Integer, Integer>();

    for (int[] test : testCases) {
      Integer key = test[0];
      Integer value = test[1];

      map.put(key, value);

      if (!value.equals(map.get(key))) {
        System.out.println("Test failed [" + key + "," + value + "]");
        passed = false;
      }
    }

    if (passed) {
      System.out.println("All tested passed");
    }

  }

  /**
   * Execution entry point.
   */
  public static void main(String args[]) {
    new HashMapImpl().doTestsPass();
  }
}
