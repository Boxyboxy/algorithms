package main.java.com.eugene.algorithms.SlidingWindow;


// Have the function stringChallenge(strArr) take the array of strings stored in strArr which will contain only 2 strings,
// the first parameter being the string N and the second parameter being a string K of some characters
// and your goal is to determine the smallest substring of N that contains all the characters in K.
//
// For example if strArr ['aaabaaddae','aed'] then the smallest substring of N that contains the characters a,e,and d is "dae" located at the end of the string.
public class SmallestSubstringContainingAllCharactersOfAnotherString {
    public static String findSmallestSubstring(String[] strArr) {
        String N = strArr[0];
        String K = strArr[1];

        int[] charCount = new int[128]; // Assuming ASCII characters

        // Initialize the character count for the characters in K
        for (char ch : K.toCharArray()) {
            charCount[ch]++;
        }

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int count = K.length();
        String result = "";

        for (int right = 0; right < N.length(); right++) {
            char rightChar = N.charAt(right);

            if (charCount[rightChar] > 0) {
                count--;
            }

            charCount[rightChar]--;

            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    result = N.substring(left, right + 1);
                }

                char leftChar = N.charAt(left);

                charCount[leftChar]++;
                if (charCount[leftChar] > 0) {
                    count++;
                }

                left++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        // Example usage
        String[] strArr = {"aaabaaddae", "aed"};
        String result = findSmallestSubstring(strArr);
        System.out.println("Smallest substring containing all characters: " + result);
    }

}
