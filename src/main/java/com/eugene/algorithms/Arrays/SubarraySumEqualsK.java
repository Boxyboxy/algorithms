package main.java.com.eugene.algorithms.Arrays;

import java.util.HashMap;
import java.util.Map;

//#prefix sum
//#cumulative sum

public class SubarraySumEqualsK {
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

    public static void main(String[] args){
        int[] input = new int[]{1,2,3};
        int k =3;

        int result = subarraySum(input, 3);
        System.out.println(result);
    }


}
