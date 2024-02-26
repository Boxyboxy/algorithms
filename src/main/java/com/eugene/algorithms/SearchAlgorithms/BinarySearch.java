package main.java.com.eugene.algorithms.SearchAlgorithms;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BinarySearch {
    public static int search(int[] nums, int target){
        int low =0;
        int high = nums.length -1;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] ==target){
                return mid;
            } else if( nums[mid] < target){
                low = mid +1;
            } else if (nums[mid] > target){
                high = mid -1;
            }

        }
        return -1;
    }

    @Test
    public void testCase1(){
        assertEquals(4, search(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    public void testCase2(){
        assertEquals(-1, search(new int[]{-1,0,3,5,9,12}, 2));
    }


}
