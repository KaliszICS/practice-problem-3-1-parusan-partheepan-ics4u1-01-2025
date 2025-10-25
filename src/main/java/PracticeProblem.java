public class PracticeProblem {

    public static void main(String args[]) {
        // Test sumOfDigits
        System.out.println(sumOfDigits(234)); // 9
        System.out.println(sumOfDigits(12));  // 3
        System.out.println(sumOfDigits(39));  // 12
        System.out.println(sumOfDigits(-12)); // 3
        
        // Test factorial
        System.out.println(factorial(5)); // 120
        System.out.println(factorial(0)); // 1
        System.out.println(factorial(3)); // 6
        System.out.println(factorial(-5)); // 0
    }
    
    // 1. Sum of digits using recursion
    public static int sumOfDigits(int x) {
        // Handle negative numbers
        if (x < 0) {
            return sumOfDigits(-x);
        }
        
        // Base case: single digit
        if (x < 10) {
            return x;
        }
        
        // Recursive case: last digit + sum of remaining digits
        return (x % 10) + sumOfDigits(x / 10);
    }
    
    // 2. Factorial using recursion
    public static int factorial(int n) {
        // Handle negative numbers
        if (n < 0) {
            return 0;
        }
        
        // Base case: 0! = 1
        if (n == 0) {
            return 1;
        }
        
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }
}