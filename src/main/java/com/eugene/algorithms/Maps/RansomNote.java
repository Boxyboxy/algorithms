package main.java.com.eugene.algorithms.Maps;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//Each letter in magazine can only be used once in ransomNote.
//
//Example 1:
//
//Input: ransomNote = "a", magazine = "b"
//Output: false
//Example 2:
//
//Input: ransomNote = "aa", magazine = "ab"
//Output: false
//Example 3:
//
//Input: ransomNote = "aa", magazine = "aab"
//Output: true
//
//Constraints:
//
//1 <= ransomNote.length, magazine.length <= 105
//ransomNote and magazine consist of lowercase English letters.

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        for(int i =0; i< magazine.length() ; i++){
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i),0) +1);
        }

        for(int i =0; i< ransomNote.length() ; i++){
            map.put(ransomNote.charAt(i), map.getOrDefault(ransomNote.charAt(i),0) -1);
        }


        Integer[] values = map.values().toArray(new Integer[0]);
        for(int i =0; i< values.length; i++){
            if(values[i] <0) return false;
        }
        return true;
    }

    @Test
    public void testCase1(){
        assertEquals(false, canConstruct("a","b"));
    }

    @Test
    public void testCase2(){
        assertEquals(false, canConstruct("aa","ab"));
    }

    @Test
    public void testCase3(){
        assertEquals(true, canConstruct("aa","aab"));
    }

}


