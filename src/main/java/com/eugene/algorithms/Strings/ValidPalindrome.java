package main.java.com.eugene.algorithms.Strings;

public class ValidPalindrome {
    //A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    //
    //Given a string s, return true if it is a palindrome, or false otherwise.
    //
    //Example 1:
    //
    //Input: s = "A man, a plan, a canal: Panama"
    //Output: true
    //Explanation: "amanaplanacanalpanama" is a palindrome.
    //Example 2:
    //
    //Input: s = "race a car"
    //Output: false
    //Explanation: "raceacar" is not a palindrome.
    //Example 3:
    //
    //Input: s = " "
    //Output: true
    //Explanation: s is an empty string "" after removing non-alphanumeric characters.
    //Since an empty string reads the same forward and backward, it is a palindrome.
    public static boolean isPalindrome(String s) {
        String word = s.replaceAll("[^a-zA-Z0-9]|\\s+", "").toLowerCase();
        int l =0;
        int r = word.length()-1;
        while(l< r){
            if(word.charAt(l) !=  word.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(String.format("Input: \"A man, a plan, a canal: Panama\", Expected: %b, Output: %b", true, isPalindrome("A man, a plan, a canal: Panama")));
        System.out.println(String.format("Input: \"race a car\", Expected: %b, Output: %b", false, isPalindrome("race a car")));
        System.out.println(String.format("Input: \"Hello\", Expected: %b, Output: %b", false, isPalindrome("Hello")));
    }
}
