package main.java.com.eugene.algorithms.NumberManipulation;

public class BinaryToDecimal {
    public static int convertBinaryToDecimal(String binaryString){
        return Integer.parseInt(binaryString, 2);
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
