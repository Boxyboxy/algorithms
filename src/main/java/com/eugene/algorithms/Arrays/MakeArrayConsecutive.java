package main.java.com.eugene.algorithms.Arrays;

// Have the function arraychallenge take the array of integers stored in arr
// and return the minimum number of integers needed to make the contents of arr consecutive from the lowest number to the highest number.
//
// For example: If arr contains 486 then the output should be 2 because two numbers need to be added to the array 5 and 7
// to make it a consecutive array of numbers from 4 to 8

import java.util.Arrays;

public class MakeArrayConsecutive {
    public static int findMinIntegers(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0; // No integers needed for an empty or single-element array
        }

        Arrays.sort(arr); // Sort the array in ascending order

        int neededIntegers = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            // -2 and 8, diff is 10
            int diff = arr[i + 1] - arr[i] - 1;
            if (diff > 0) {
                neededIntegers += diff;
            }
        }

        return neededIntegers;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {4, 8, 6};
        int result = findMinIntegers(arr);
        System.out.println("Minimum number of integers needed: " + result);

        int[] arr1 = {-2, 8, 10};
        int result1 = findMinIntegers(arr1);
        System.out.println("Minimum number of integers needed: " + result1);
    }
}
