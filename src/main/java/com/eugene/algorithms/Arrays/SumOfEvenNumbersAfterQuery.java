package main.java.com.eugene.algorithms.Arrays;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

// 985. Sum of even numbers after queries (Medium)
// https://leetcode.com/problems/sum-of-even-numbers-after-queries/description/
// #Array
// #Simulation
// You are given an integer array nums and an array queries where queries[i] = [vali, indexi].
//
//For each query i, first, apply nums[indexi] = nums[indexi] + vali, then print the sum of the even values of nums.
//
//Return an integer array answer where answer[i] is the answer to the ith query.
//Example 1:
//
//Input: nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
//Output: [8,6,2,4]
//Explanation: At the beginning, the array is [1,2,3,4].
//After adding 1 to nums[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
//After adding -3 to nums[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
//After adding -4 to nums[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
//After adding 2 to nums[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.
//Example 2:
//
//Input: nums = [1], queries = [[4,0]]
//Output: [0]
public class SumOfEvenNumbersAfterQuery {


    public static int sumOfEvenNumbersInArr(int[] nums){
        int sum = 0;
        for(int i =0; i< nums.length; i++){
            if( nums[i] %2 ==0){
                sum+= nums[i];
            }
        }
        return sum;
    }
    public static int[] sumEvenAfterQueries2(int[] nums, int[][] queries) {
        int sum = 0;
        for(int i =0; i< nums.length; i++){
            if( nums[i] %2 ==0){
                sum+= nums[i];
            }
        }

        int[] result = new int[ queries.length];
        for(int i =0; i< queries.length; i++){
            int value = queries[i][0];
            int index = queries[i][1];

            int pre = nums[index];
            nums[index] += value;

            if (pre%2 ==0){
                sum -= pre;
            }

            if(nums[index] %2 ==0){
                sum+= nums[index];
            }

            result[i] = sum;
        }
        return result;
    }

    @Test
    public void testCase1(){
        int[] result = sumEvenAfterQueries2(new int[]{1,2,3,4} ,new int[][]{
                {1,0},
                {-3,1},
                {-4,0},
                {2, 3}
        });

        assertNotNull(result);
        assertEquals(4, result.length);
        assertEquals(8,result[0]);
        assertEquals(6,result[1]);
        assertEquals(2,result[2]);
        assertEquals(4,result[3]);
    }

    @Test
    public void testCase2(){
        int[] result = sumEvenAfterQueries2(new int[]{1} ,new int[][]{
                {4,0},
        });
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(0,result[0]);
    }


    public static void main(String[] args){
        int[] inputNums = new int[]{1,2,3,4};
        int[][] inputQueries = new int[][]{
                {1,0},
                {-3,1},
                {-4,0},
                {2, 3}
        };

        int[] result = sumEvenAfterQueries2(inputNums, inputQueries);

        for(int i =0; i< result.length; i++){
            System.out.println(result[i]);
        }

    }

}
