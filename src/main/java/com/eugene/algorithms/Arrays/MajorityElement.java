package main.java.com.eugene.algorithms.Arrays;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
// Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
//
//Constraints:
//
//n == nums.length
//1 <= n <= 5 * 104
//-109 <= nums[i] <= 109
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) +1);
            if(map.get(num) > nums.length /2){
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        int result = majorityElement(new int[]{3,2,3});
    }

    @Test
    public void testCase1(){
        assertEquals(3, majorityElement(new int[]{3,2,3}));
    }

    @Test
    public void testCase2(){
        assertEquals(2, majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

}
