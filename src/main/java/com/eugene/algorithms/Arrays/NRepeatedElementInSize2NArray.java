package main.java.com.eugene.algorithms.Arrays;
import org.junit.Test;
import java.util.HashSet;
import static junit.framework.TestCase.assertEquals;
// N-RepeatedElement in size 2N array
// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/description/
// #Array
// #Hash Table
// You are given an integer array nums with the following properties:
//nums.length == 2 * n.
//nums contains n + 1 unique elements.
//Exactly one element of nums is repeated n times.
//
// Return the element that is repeated n times.

// Example 1:
//
//Input: nums = [1,2,3,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,1,2,5,3,2]
//Output: 2
//Example 3:
//
//Input: nums = [5,1,5,2,5,3,5,4]
//Output: 5
public class NRepeatedElementInSize2NArray {
    public static int repeatedNTimes( int[] nums){
        HashSet<Integer> hp = new HashSet<>();

        for(int a : nums){
            if(hp.contains(a)) return a;
            else hp.add(a);
        }
        return -1;

    }

    @Test
    public void testCase1(){
        assertEquals(3, repeatedNTimes(new int[]{1,2,3,3}));
    }

    @Test
    public void testCase2(){
        assertEquals(2, repeatedNTimes(new int[]{2,1,2,5,3,2}) );
    }

    @Test
    public void testCase3(){
        assertEquals(5, repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}) );
    }

    public static void main(String[] args){
        int[] input = new int[]{2,1,2,5,3,2};

        int output = repeatedNTimes(input);
        System.out.println(output);
    }
}
