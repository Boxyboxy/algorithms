package main.java.com.eugene.algorithms.Arrays;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

// 121. Best Time to Buy and Sell Stock (EASY)
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// #Array
// #Dynamic programming
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//Example 1:
//
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//Example 2:
//
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int lowest = prices[0];

        for(int i =1; i< prices.length; i++){
            lowest = prices[i] < lowest? prices[i]: lowest;

            maxProfit = maxProfit < prices[i] - lowest? prices[i] - lowest : maxProfit;
        }

        return maxProfit;
    }

    @Test
    public void testCase1(){
        assertEquals(5, maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void testCase2(){
        assertEquals(0,  maxProfit(new int[]{7,6,4,3,1}) );
    }
    public static void main(String[] args){
        System.out.println( String.format("prices = (7,1,5,3,6,4), Expected = %d, Output =  %d", 5, maxProfit(new int[]{7,1,5,3,6,4}) ) );
        System.out.println( String.format("prices = (7,6,4),3,1, Expected = %d, Output =  %d", 0, maxProfit(new int[]{7,6,4,3,1}) ) );


    }
}
