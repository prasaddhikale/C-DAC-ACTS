import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Initialize a number to some integer value
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
        int number = 5;

        // Find and print its factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Function to calculate factorial
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
