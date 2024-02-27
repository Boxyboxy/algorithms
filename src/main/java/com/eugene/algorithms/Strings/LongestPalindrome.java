package main.java.com.eugene.algorithms.Strings;
// 409. Longest Palindrome (EASY)
// https://leetcode.com/problems/longest-palindrome/description/

//Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
//
//Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

//Example 1:
//
//Input: s = "abccccdd"
//Output: 7
//Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
//Example 2:
//
//Input: s = "a"
//Output: 1
//Explanation: The longest palindrome that can be built is "a", whose length is 1.
//
//
//Constraints:
//
//1 <= s.length <= 2000
//s consists of lowercase and/or uppercase English letters only.

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        for(int i =0; i< s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1 );
        }

        Integer[] values = map.values().toArray(new Integer[0]);

        int sum = 0;
        boolean addedOdd = false;
        for(int i =0; i< values.length; i++){
            //even
            if(values[i] %2 ==0){
                sum+= values[i];
            } else { //odd
                if(values[i] > 0){
                    if(!addedOdd){
                        sum+= (values[i] );
                        addedOdd = true;
                    } else {
                        sum+= (values[i] -1);
                    }
                }
            }
        }
        return sum;
    }

    @Test
    public void testCase1(){
        assertEquals(7, longestPalindrome("abccccdd"));
    }

    @Test
    public void testCase2(){
        assertEquals(1, longestPalindrome("a"));
    }

}
