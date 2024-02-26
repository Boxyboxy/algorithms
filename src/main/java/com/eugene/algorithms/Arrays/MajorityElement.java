package main.java.com.eugene.algorithms.Arrays;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

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
