package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
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
