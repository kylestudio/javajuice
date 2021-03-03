package examples;
//
//public class Solution2 {
// Assuming if we have java like language called MyLang, then we are calling a service that using JSON.
// One day we found that a new service interface returns a large number. After a few discussions, we decide to
// implement LargeNumber class of our own.
// 1. Design this LargeNumber class.
// 2. Explain the data structure you chose.
// 3. LargeNumber(String str)
// 4. Implement subtract(LargeNumber num) method

//  LargeNumber num1 = new LargeNumber("123");
//  LargeNumber num2 = new LargeNumber("14");
//  LargeNumber num3 = num1.subtract(num2)
//System.out.println(num3); // "109"

// public str.toCharArray() => char[]
//'0' ==> (int)'0' ==> 48

//Amazon interview largeNumber

import java.util.ArrayList;

public class LargeNumber {


  private ArrayList<Integer> numArray = new ArrayList();

  public LargeNumber(String str) { //null ""
    for (char c : str.toCharArray()) {
      numArray.add(Integer.parseInt(String.valueOf(c)));
    }
    //123 -> [1,2,3] -revise ->[3,2,1]

    //99 -> [8,9] - [9,8]

  }

  public ArrayList<Integer> getArray() {
    return numArray;
  }

  //123 - 14 vs 14 - 123 -> ~flag, 123-14
  public ArrayList<Integer> subtract(LargeNumber num) {

//      ArrayList<Integer> reviseLocal = numArray.reverse();
    ArrayList<Integer> reviseLocal = numArray;
//      ArrayList<Integer> reviseInput = num.reverse();
    ArrayList<Integer> reviseInput = num.getArray();

    ArrayList<Integer> res = new ArrayList();

    //100000 -1 //
    for (int i = 0; i < reviseLocal.size(); i++) {
      if (i >= reviseInput.size()) {
        res.add(reviseLocal.get(i));
      }
      Integer localDig = reviseLocal.get(i);
      Integer inputDig = reviseInput.get(i);
      if (localDig >= inputDig) {
        res.add(localDig - inputDig);
      } else {
        Integer temp = reviseLocal.get(i + 1);
        reviseLocal.set(i + i, temp - 1);
        res.add(localDig + 10 - inputDig);
      }

    }

//      return res.reverse();
    return res;
  }
}

