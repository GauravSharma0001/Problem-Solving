//20. Valid Parentheses
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//An input string is valid if:

//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.

import java.util.ArrayDeque;
import java.util.Deque;

public class Day24_Valid_Parentheses {
    public static void main(String[] args) {
        String s="([])";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Deque<Character> stack= new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '(' -> stack.push('(');
                case '{' -> stack.push('{');
                case '[' -> stack.push('[');
                case ')' -> {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        return false;
                    }
                    stack.pop();
                }

                case '}' -> {
                    if (stack.isEmpty() || stack.peek() != '{') {
                        return false;
                    }
                    stack.pop();
                }

                case ']' -> {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
