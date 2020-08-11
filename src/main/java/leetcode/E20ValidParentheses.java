package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 * <p>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
 * input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets. Open brackets must be closed in the
 * correct order. Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()" Output: true Example 2:
 * <p>
 * Input: "()[]{}" Output: true Example 3:
 * <p>
 * Input: "(]" Output: false Example 4:
 * <p>
 * Input: "([)]" Output: false Example 5:
 * <p>
 * Input: "{[]}" Output: true
 */
public class E20ValidParentheses {

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if ("{([".indexOf(c) != -1) {
                stack.push(map.get(c));
            } else if ("})]".indexOf(c) != -1) {
                if (stack.isEmpty() || c != stack.pop()) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{{{}}}[](())")); //true
        System.out.println(isValid("{{{}}[](())")); //false
        System.out.println(isValid("{{}}}[](())")); //false
        System.out.println(isValid("[{{{}}}](())")); //true
        System.out.println(isValid("{{{}}}[](()")); //false
    }
}
