package whileLoop;
import java.util.*;

public class LoopProblems {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        printNumbers1To10();
        printNumbersReverse();
        printEvenNumbers(100);
        printOddNumbers(100);

        printMultiplicationTable(n);

        System.out.println("Sum of first " + n + " natural numbers: " + sumNaturalNumbers(n));
        System.out.println("Sum of even numbers up to " + n + ": " + sumEven(n));
        System.out.println("Sum of odd numbers up to " + n + ": " + sumOdd(n));

        System.out.println("Factorial of " + n + ": " + factorial(n));
        System.out.println("Product of digits: " + productOfDigits(n));
        System.out.println("Digit count: " + countDigits(n));

        int reversed = reverseNumber(n);
        System.out.println("Reversed number: " + reversed);
        System.out.println("Palindrome: " + (isPalindrome(n) ? "Yes" : "No"));

        System.out.println("Sum of digits: " + sumOfDigits(n));
        System.out.println("Armstrong: " + (isArmstrong(n) ? "Yes" : "No"));
        System.out.println("Perfect Number: " + (isPerfect(n) ? "Yes" : "No"));

        printPrimesUpTo100();
        System.out.println(n + " is Prime: " + isPrime(n));

        printFibonacci(n);
        System.out.println("Sum of Fibonacci: " + sumFibonacci(n));

        printSquares(n);
        printCubes(n);

        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        printDivisibleBy7(a, b);

        printFactors(n);
        System.out.println("Sum of factors: " + sumOfFactors(n));

        System.out.println("Max digit: " + maxDigit(n));
    }

    // ---------------- BASIC LOOPS ----------------

    static void printNumbers1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    static void printNumbersReverse() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    static void printEvenNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    static void printOddNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }

    // ---------------- MATH OPERATIONS ----------------

    static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    static int sumEven(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) sum += i;
        }
        return sum;
    }

    static int sumOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) sum += i;
        }
        return sum;
    }

    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    // ---------------- DIGIT OPERATIONS ----------------

    static int productOfDigits(int n) {
        int product = 1;
        while (n > 0) {
            product *= (n % 10);
            n /= 10;
        }
        return product;
    }

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return reversed;
    }

    static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    // ---------------- NUMBER CHECKS ----------------

    static boolean isArmstrong(int n) {
        int digits = countDigits(n);
        int sum = 0, temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void printPrimesUpTo100() {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    // ---------------- FIBONACCI ----------------

    static void printFibonacci(int n) {
        if (n <= 0) return;

        int[] fib = new int[n];

        if (n >= 1) fib[0] = 0;
        if (n >= 2) fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("Fibonacci series:");
        for (int num : fib) System.out.println(num);
    }

    static int sumFibonacci(int n) {
        if (n <= 0) return 0;

        int a = 0, b = 1, sum = a + b;

        for (int i = 2; i < n; i++) {
            int c = a + b;
            sum += c;
            a = b;
            b = c;
        }
        return sum;
    }

    // ---------------- EXTRA ----------------

    static void printSquares(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
        }
    }

    static void printCubes(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Cube of " + i + " = " + (i * i * i));
        }
    }

    static void printDivisibleBy7(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i % 7 == 0) System.out.println(i);
        }
    }

    static void printFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.println(i);
        }
    }

    static int sumOfFactors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }

    static int maxDigit(int n) {
        int max = 0;
        while (n > 0) {
            max = Math.max(max, n % 10);
            n /= 10;
        }
        return max;
    }


    static int gcd(int a, int b){
        a= Math.abs(a);
        b = Math.abs(b);
        while(b>0){
            int temp =  a % b;
            a = b;
            b = temp;

        }
        return a;
    }

    static int lcm(int a , int b ){
        a= Math.abs(a);
        b = Math.abs(b);

        return Math.abs(a*b)/gcd(a,b);
    }
}