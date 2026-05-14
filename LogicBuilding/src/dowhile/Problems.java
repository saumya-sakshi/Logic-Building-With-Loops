package dowhile;

import java.util.Scanner;

public class Problems {

    /**
     * 1. Print all numbers from 1 to 10.
     * 2. Print the multiplication table of a given number.
     * 3. Keep taking numbers from the user until 0 is entered, then print the sum of all entered numbers.
     * 4. Keep taking numbers from the user until 0 is entered, then print the largest number among all inputs.
     * 5. Count and print the number of digits in the given number.
     * 6. Reverse the given number and print the reversed value.
     * 7. Check whether the given number is a palindrome.
     * 8. Check whether the given number is an Armstrong number.
     * 9. Calculate and print the factorial of the given number.
     * 10. Print the Fibonacci series up to the required number of terms.
     * 11. Find the HCF (Highest Common Factor) of the given numbers.
     * 12. Create a menu-driven program that allows the user to choose and perform different operations.
     * 13. Keep taking numbers from the user until a negative number is entered, then count how many positive numbers were entered.
     * 14. Find and print the sum of digits of the given number.
     * 15. Calculate and print the sum of even digits and the sum of odd digits of the given number separately.
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Enter a number.");
                sc.next(); // discard invalid
            }

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    printNumbers();
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    int n1 = sc.nextInt();
                    printMultiplicationTable(n1);
                    break;

                case 3:
                    printUntilZero(sc);
                    break;

                case 4:
                    System.out.print("Enter number: ");
                    int n2 = sc.nextInt();
                    System.out.println("Digits: " + countDigits(n2));
                    break;

                case 5:
                    System.out.print("Enter number: ");
                    int n3 = sc.nextInt();
                    System.out.println("Reversed: " + reverseNumber(n3));
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    int n4 = sc.nextInt();
                    System.out.println(isPalindrome(n4) ? "Palindrome" : "Not Palindrome");
                    break;

                case 7:
                    System.out.print("Enter number: ");
                    int n5 = sc.nextInt();
                    System.out.println(isArmstrong(n5) ? "Armstrong" : "Not Armstrong");
                    break;

                case 8:
                    System.out.print("Enter number: ");
                    int n6 = sc.nextInt();
                    System.out.println("Factorial: " + factorial(n6));
                    break;

                case 9:
                    System.out.print("Enter terms: ");
                    int n7 = sc.nextInt();
                    fibonacci(n7);
                    break;

                case 10:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println("HCF: " + hcf(a, b));
                    break;

                case 11:
                    printUntilNegative(sc);
                    break;

                case 12:
                    System.out.print("Enter number: ");
                    int n8 = sc.nextInt();
                    System.out.println("Sum of digits: " + sumOfDigits(n8));
                    break;

                case 13:
                    System.out.print("Enter number: ");
                    int n9 = sc.nextInt();
                    evenOddSum(n9);
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }

    // ---------------- MENU ----------------

    static void printMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Print numbers 1 to 10");
        System.out.println("2. Multiplication Table");
        System.out.println("3. Sum & Max until 0");
        System.out.println("4. Count digits");
        System.out.println("5. Reverse number");
        System.out.println("6. Check Palindrome");
        System.out.println("7. Check Armstrong");
        System.out.println("8. Factorial");
        System.out.println("9. Fibonacci Series");
        System.out.println("10. HCF of two numbers");
        System.out.println("11. Count positives until negative");
        System.out.println("12. Sum of digits");
        System.out.println("13. Sum of even & odd digits");
        System.out.println("0. Exit");
    }

    // ---------------- METHODS (CLEAN) ----------------

    static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    static void printUntilZero(Scanner sc) {
        int n, sum = 0, max = Integer.MIN_VALUE;

        do {
            System.out.print("Enter number: ");
            n = sc.nextInt();
            if (n != 0) {
                sum += n;
                max = Math.max(max, n);
            }
        } while (n != 0);

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
    }

    static int countDigits(int n) {
        int count = 0;
        do {
            count++;
            n /= 10;
        } while (n != 0);
        return count;
    }

    static int reverseNumber(int n) {
        int rev = 0;
        do {
            rev = rev * 10 + n % 10;
            n /= 10;
        } while (n != 0);
        return rev;
    }

    static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = countDigits(n);

        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, digits);
            n /= 10;
        }
        return sum == original;
    }

    static long factorial(int n) {
        if (n == 0) return 1;
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static void printUntilNegative(Scanner sc) {
        int n, count = 0;

        do {
            System.out.print("Enter number: ");
            n = sc.nextInt();
            if (n >= 0) count++;
        } while (n >= 0);

        System.out.println("Positive numbers count: " + count);
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static void evenOddSum(int n) {
        int even = 0, odd = 0;

        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0) even += d;
            else odd += d;
            n /= 10;
        }

        System.out.println("Even sum: " + even);
        System.out.println("Odd sum: " + odd);
    }
}