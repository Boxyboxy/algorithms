package main.java.com.eugene.algorithms.Strings;

// Have the function StringChallege(Str) take the str parameter being passed and return the smallest number you can get through the following reduction method.
// The method is: Only the letters a, b, c will be given in str and you must take the 2 different adjacent characters and replace it with the third.
// For example "ac" can be replaced with "b" but "aa" canot be replaced with anything.
// This method is done repeatedly until the string cannot be further reduced, and the length of the resulting string is to be outputted.
public class StringReduction {
    public static int reduceString(String str) {
        // Convert the string to a StringBuilder for easier manipulation
        StringBuilder sb = new StringBuilder(str);

        // Flag to check if any reduction occurred in the current pass
        boolean reductionOccurred = true;

        // set reductionOccurred to false so that if no reduction happens, result is in it's final form
        while (reductionOccurred) {
            reductionOccurred = false;
            int i = 0;

            while (i < sb.length() - 1) {
                char current = sb.charAt(i);
                char next = sb.charAt(i + 1);

                if ((current == 'a' && next == 'b') || (current == 'b' && next == 'a')) {
                    sb.replace(i, i + 2, "c");
                    reductionOccurred = true;
                } else if ((current == 'a' && next == 'c') || (current == 'c' && next == 'a')) {
                    sb.replace(i, i + 2, "b");
                    reductionOccurred = true;
                } else if ((current == 'b' && next == 'c') || (current == 'c' && next == 'b')) {
                    sb.replace(i, i + 2, "a");
                    reductionOccurred = true;
                }

                System.out.println(sb.toString());

                i++;
            }
            System.out.println("end of reductionOccured while loop and reductionOccurred is " + reductionOccurred);
        }

        // Output the length of the resulting string
        return sb.length();
    }

    public static void main(String[] args) {
        // Example usage
        String input = "abac";
        int result = reduceString(input);
        System.out.println("Length of the resulting string: " + result);
    }
}
