package main.java.com.eugene.algorithms.SlidingWindow;

import java.util.HashSet;

// Given a string s, find the length of the longest substring without repeating characters.
//
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
public class LongestSubStringWithoutRepeatingCharacters {
    public static int lengthofLongestSubString(String s){
        HashSet<Character> charSet = new HashSet<>();
        int maxLength =0;
        int start = 0;
        int end =0;
        String substring = "";

        while(end < s.length()){
            if(!charSet.contains(s.charAt(end)) ){
                charSet.add(s.charAt(end));
                end++;

                if(end - start > maxLength){
                    substring  = s.substring(start, end);
                }
                maxLength = Math.max(maxLength, end - start);

            } else {
                charSet.remove(s.charAt(start));
                start++;
            }
        }

        System.out.println(substring);
        return maxLength;
    }

    public static void main(String[] args) {
        // Example usage
        String input = "abcabcbb";
        int result = lengthofLongestSubString(input);
        System.out.println("Length of the longest substring: " + result);
    }
}
