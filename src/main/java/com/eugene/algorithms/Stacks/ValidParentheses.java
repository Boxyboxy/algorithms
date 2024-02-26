package main.java.com.eugene.algorithms.Stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s){
        // Collection cannot include primitive data types
        // initialisation of hashmap using the double brace syntax
        Map<Character,Character> mappings = new HashMap<Character,Character>(){{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};
        // Collection cannot include primitive data types
        Stack<Character> letters = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(!mappings.containsKey(s.charAt(i))){
                letters.push(s.charAt(i));
            } else {
                if (!letters.isEmpty() && letters.peek() == mappings.get(s.charAt(i))){
                    letters.pop();
                } else {
                    return false;
                }
            }
        }
        return letters.isEmpty();
    }

    public static void main(String[] args){
        String input1 = "()";
        System.out.println(String.format("Expected: %b, Output: %b ", true, isValid("()")) );
        System.out.println(String.format("Expected: %b, Output: %b ", true, isValid("()[]{}")) );
        System.out.println(String.format("Expected: %b, Output: %b ", false, isValid("(]")) );
        System.out.println(String.format("Expected: %b, Output: %b ", false, isValid(")")) );
    }

}
