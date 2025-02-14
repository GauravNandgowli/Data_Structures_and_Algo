public class CountX {

    // Recursive function to count lowercase 'x' characters
    public static int countX(String str) {
        if (str.length() == 0)
            return 0; // Base case: if string is empty, return 0
        int count = 0;

        if (str.charAt(str.length() - 1) == 'x') {
            count += 1; // If the last character is 'x', increment the count
        }

        // Recursively count the 'x' characters in the rest of the string
        return count + countX(str.substring(0, str.length() - 1));
    }

    // Main method to test the countX function
    public static void main(String[] args) {
        // Test cases
        System.out.println(countX("xxhixx")); // Expected output: 4
        System.out.println(countX("xhixhix")); // Expected output: 3
        System.out.println(countX("hi")); // Expected output: 0
        System.out.println(countX("h")); // Expected output: 0
        System.out.println(countX("x")); // Expected output: 1
        System.out.println(countX("")); // Expected output: 0
        System.out.println(countX("hihi")); // Expected output: 0
        System.out.println(countX("hiAAhi12hi")); // Expected output: 0
        System.out.println(countX("xxxx")); // Expected output: 4
        System.out.println(countX("hxixhx")); // Expected output: 3
        System.out.println(countX("xxHxx")); // Expected output: 4
    }
}
