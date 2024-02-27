package main.java.com.eugene.algorithms.Arrays;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

// 560. Subarray Sum Equals K (MEDIUM)
//https://leetcode.com/problems/subarray-sum-equals-k/description/
//#prefix sum
//#cumulative sum
//#Array
//#Hash Table

//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//
//A subarray is a contiguous non-empty sequence of elements within an array.
//
//Example 1:
//
//Input: nums = [1,1,1], k = 2
//Output: 2
//Example 2:
//
//Input: nums = [1,2,3], k = 3
//Output: 2
//
//
//Constraints:
//
//1 <= nums.length <= 2 * 104
//-1000 <= nums[i] <= 1000
//-107 <= k <= 107
public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        int count =0;
        int sum = 0;
        sumCountMap.put(0,1);
        for(int num: nums){
            sum+=num;

            if(sumCountMap.containsKey(sum - k)){
                count += sumCountMap.get(sum -k);
            }

            sumCountMap.put(sum, sumCountMap.getOrDefault(sum, 0) +1);
        }
        return count;
    }

    @Test
    public void testCase1(){
        assertEquals(2, subarraySum(new int[]{1,1,1} , 2));
    }

    @Test
    public void testCase2(){
        assertEquals(2, subarraySum(new int[]{1,2,3}, 3) );
    }

    public static void main(String[] args){

    }


}
