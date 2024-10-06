package tasks;

import java.util.Stack;

public class ValidParentheses {
    /**
     * Реалізуй метод isValidParentheses(), який приймає рядок string і визначає,
     * чи дійсний в ньому порядок дужок ( та ).
     * Метод повинен повертати true, якщо порядок дійсний, і false, якщо ні.
     * риклади:
     * isValidParentheses("()") == true
     * isValidParentheses("())") == false
     * isValidParentheses("(abc())") == true
     * isValidParentheses(")(()))") == false
     *
     * @param string
     * @return
     */
    public static boolean isValidParentheses(String string) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = string.toCharArray();
        for (char s : charArray) {
            if (s == '(') {
                stack.push(s);
            } else if (s == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();

            }
        }
        return stack.isEmpty();
    }
}
