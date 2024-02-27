package main.java.com.eugene.algorithms.Strings;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

// 242. Valid Anagram (EASY)
//  https://leetcode.com/problems/valid-anagram/description/
// #String #Hash Table
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//
//
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false
//
//Constraints:
//
//1 <= s.length, t.length <= 5 * 104
//s and t consist of lowercase English letters.
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i< s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1);
        }

        for(int i = 0; i< t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) -1);
        }
        Integer[] values = map.values().toArray(new Integer[0]);
        for(int i =0; i< values.length; i++) {
            if (values[i] != 0) {
                return false;
            }
        }

        return true;
    }
    @Test
    public void testCase1(){
        assertEquals(true, isAnagram("anagram", "nagaram"));
    }

    @Test
    public void testCase2(){
        assertEquals(false, isAnagram("cat", "rat"));
    }

}

