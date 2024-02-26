package main.java.com.eugene.algorithms.Arrays;

public class RotateArray {
    // Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

//    Example 1:
//
//    Input: nums = [1,2,3,4,5,6,7], k = 3
//    Output: [5,6,7,1,2,3,4]
//    Explanation:
//    rotate 1 steps to the right: [7,1,2,3,4,5,6]
//    rotate 2 steps to the right: [6,7,1,2,3,4,5]
//    rotate 3 steps to the right: [5,6,7,1,2,3,4]
//    Example 2:
//
//    Input: nums = [-1,-100,3,99], k = 2
//    Output: [3,99,-1,-100]
//    Explanation:
//    rotate 1 steps to the right: [99,-1,-100,3]
//    rotate 2 steps to the right: [3,99,-1,-100]

    public static void rotate(int[] nums, int k){
        int refactoredRotation = k % nums.length;

        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            // Swap elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        start = 0;
        end = refactoredRotation -1;
        while (start < end) {
            // Swap elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        start = refactoredRotation;
        end = nums.length-1;
        while (start < end) {
            // Swap elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }


        for(int i =0; i< nums.length; i++){
            System.out.println(nums[i]);
        }

    }

    public static void main(String[] args){
        int[] inputArr = new int[]{1,2,3,4,5,6,7};
        int units = 11;
        rotate(inputArr, units);
    }
}
