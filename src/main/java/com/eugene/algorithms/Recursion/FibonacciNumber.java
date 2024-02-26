package main.java.com.eugene.algorithms.Recursion;

public class FibonacciNumber {
    // The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
    //
    //F(0) = 0, F(1) = 1
    //F(n) = F(n - 1) + F(n - 2), for n > 1.
    //Given n, calculate F(n).

    public static int fib(int n){
        if(n ==0 ){
            return 0;
        }
        if(n==1 || n ==2){
            return 1;
        }

        return fib(n-2) + fib(n-1);
    }

    public static void main(String[] args){

        System.out.println(String.format("Fibonacci number for %d is %d ", 4, fib(4)));
        System.out.println(String.format("Fibonacci number for %d is %d ", 5, fib(5)));
        System.out.println(String.format("Fibonacci number for %d is %d ", 6, fib(6)));

    }

}
