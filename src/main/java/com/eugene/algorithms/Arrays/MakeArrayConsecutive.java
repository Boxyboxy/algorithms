package main.java.com.eugene.algorithms.Arrays;

// Coderbyte test
// Have the function findMinIntegers take the array of integers stored in arr
// and return the minimum number of integers needed to make the contents of arr consecutive from the lowest number to the highest number.
//
// For example: If arr contains 486 then the output should be 2 because two numbers need to be added to the array 5 and 7
// to make it a consecutive array of numbers from 4 to 8

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

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

    @Test
    public void testCase1(){
        assertEquals(2, findMinIntegers(new int[]{4, 8, 6}));
    }

    @Test
    public void testCase2(){
        assertEquals(10, findMinIntegers(new int[]{-2, 8, 10}) );
    }


}
