package main.java.com.eugene.algorithms.NumberManipulation;

import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.TestCase.assertEquals;

public class BinaryToDecimal {
    public static int convertBinaryToDecimal(String binaryString){
        BigInteger a = new BigInteger(binaryString,2);
        return Integer.parseInt(binaryString, 2);
    }

    @Test
    public void testCase1(){
        assertEquals(53, convertBinaryToDecimal("110101"));
    }

 
    public static void main(String[] args) {
        // Binary string
        String binaryString = "110101";

        // Convert binary string to decimal integer
        int decimalValue = convertBinaryToDecimal(binaryString);

        // Display the result
        System.out.println("Binary: " + binaryString);
        System.out.println("Decimal: " + decimalValue);
    }


}
