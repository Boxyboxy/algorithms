package main.java.com.eugene.algorithms.Arrays;

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

    public static void main(String[] args){
        System.out.println( String.format("prices = (7,1,5,3,6,4), Expected = %d, Output =  %d", 5, maxProfit(new int[]{7,1,5,3,6,4}) ) );
        System.out.println( String.format("prices = (7,6,4),3,1, Expected = %d, Output =  %d", 0, maxProfit(new int[]{7,6,4,3,1}) ) );
    }
}
