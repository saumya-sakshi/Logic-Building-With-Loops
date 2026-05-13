import java.util.Arrays;
import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        /**
         * 1. Print all numbers from 1 to 10 using a loop.
         * 2. Print numbers from 10 down to 1 in reverse order.
         * 3. Print all even numbers between 1 and 100.
         * 4. Print all odd numbers between 1 and 100.
         * 5. Print the multiplication table of a given number from n × 1 to n × 10
         *  Calculate and print the sum of the first n natural numbers.
         * 7. Calculate the sum of all even numbers from 1 up to n.
         * 8. Calculate the sum of all odd numbers from 1 up to n.
         * 9. Calculate and print the factorial of a given number.
         * 10. Find and print the product of all digits of a given number.
         * 11. Count and print the total number of digits in a given number.
         * 12. Reverse the given number and print the reversed value.
         * 13. Check whether the given number is a palindrome.
         * 14. Find and print the sum of digits of the given number.
         * 15. Check whether the given number is an Armstrong number.
         * 16. Check whether the given number is a Perfect number.
         * 17. Print all prime numbers between 1 and 100.
         * 18. Check whether the given number is a prime number.
         * 19. Print the Fibonacci series up to n terms.
         * 20. Find and print the sum of the Fibonacci series up to n terms.
         * 21. Print the square of each number from 1 to n.
         * 22. Print the cube of each number from 1 to n.
         * 23. Print all numbers between a and b that are divisible by 7.
         * 24. Print all factors of the given number.
         * 25. Find and print the sum of all factors of the given number.
         * 26. Find the HCF (Highest Common Factor) of two given numbers. 27. Find the LCM (Least Common Multiple) of two given numbers. 28. Find the smallest digit in the given number.
         * 29. Find the largest digit in the given number.
         **/

        int i=1;
        while(i<=10){
           // System.out.println(i);
            i++;
        }

        i = 10;
        while(i>0){
            //System.out.println(i);
            i--;
        }

        int j =1;
        while(j<=100){
            if(j%2==0){
                //System.out.println(j);
            }
            j++;
        }

        int k =1;
        while(k<=100){
            if(k%2!=0){
                //System.out.println(k);
            }
            k++;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int s=1;
        while(s<=10){
            System.out.println(n+ " X "+ s +" = "+ n * s);
            s++;
        }

        int a =1;
        int sum =0;
        while(a<=n){
           sum = sum + a;
            a++;
        }
        System.out.println("SUM OF fIRST "+n+" NATURAL NUMBERS: "+ sum);

         a =1;
         sum =0;
        while(a<=n){
            if(a%2==0){sum = sum + a;}

            a++;
        }
        System.out.println("Sum of all even numbers from 1 up to  "+n+" : "+ sum);
        a =1;
        sum =0;
        while(a<=n){
            if(a%2!=0){sum = sum + a;}
            a++;
        }
        System.out.println("Sum of all odd numbers from 1 up to  "+n+" : "+ sum);
        //FACTORIAL
        long factorial = 1;
        int temp =n;
        while(temp>0){
            factorial = factorial * temp;
            temp--;
        }
        //System.out.println("Factorial of "+n+" : "+factorial);


        temp =n;
        long product = 1;
        while(temp>0){
            product = product * (temp%10);
            temp = temp/10;
        }
        System.out.println("Product of  digits in "+n+" : "+product);


        temp = n;
        int count =0;
        while(temp>0){
            count++;
            temp = temp/10;
        }
        System.out.println("Count of digits in "+n+" : "+count);

      int reversedNumber =0;
      temp =n;
      while(temp>0){
           int digit = temp%10;
           reversedNumber = (reversedNumber*10)+ digit;
           temp = temp/10;
      }
      System.out.println("Reversed number "+reversedNumber);


      if(reversedNumber==n) System.out.println(n+ " is a palindrome.");
      else System.out.println(n+ " is NOT a palindrome.");

      temp = n;
      sum =0;
      while(temp>0){
          sum = sum+(temp%10);
          temp=temp/10;
      }
      System.out.println("Sum of digits in "+n+" : "+sum);

      int armstrong =0;
      temp =n;
      while(temp>0){
          int  digit = temp%10;
          armstrong = (int) (armstrong + Math.pow(digit,count));
          temp = temp/10;
      }

      if(armstrong==n) System.out.println(n+ " is an ARMSTRONG number.");
      else System.out.println(n+ " is NOT an ARMSTRONG number.");

      sum=0;
        i = 1;
        while(i<n){
            if(n%i==0){
                sum = sum + i;


            }
            i++;
        }

        if(sum==n) System.out.println(n+ " is a perfect number.");
        else  System.out.println(n+ " is NOT a perfect number.");

        i=2;
        while(i<=100){
            j =2;
            boolean isPrime = true;
            while(j<=i/2){
                if(i%j==0){
                    isPrime=false;break;}
                j++;
            }
            if(isPrime){System.out.println("Prime number "+ i);}
            i++;
        }

        i =2;
        boolean isPrime = true;
        while(i<=n/2){
          if(n%i==0){ isPrime=false;break;}
          i++;
        }
        if(isPrime){System.out.println(n +" is a Prime number ");}
        else {System.out.println(n+" is NOT a Prime number ");}


        int[] fibonaci = new int[n];

        fibonaci[0] = 0;
        fibonaci[1] = 1;
        i =2;
        while(i<n){
            fibonaci[i]=fibonaci[i-1]+fibonaci[i-2];
        i++;
        }

        System.out.println("the Fibonacci series up to "+n+" terms: ");
        Arrays.stream(fibonaci).forEach(System.out::println);

        sum =0;
        i=0;
        while(i<n){
            sum = sum + fibonaci[i];
            i++;
        }
        System.out.println("the Fibonacci series up to "+n+" terms has sum: " +sum);

        i =1;
        while(i<=n){
            System.out.println("The square of "+i +" is: "+Math.pow(i,2));
            i++;
        }

        i =1;
        while(i<=n){
            System.out.println("The cube of "+i +" is: "+Math.pow(i,3));
            i++;
        }


        System.out.println("Enter A:");
        int A = sc.nextInt();
        System.out.println("Enter B:");
        int B = sc.nextInt();

        while(A<B){
            if (A % 7 == 0) {
                System.out.println(A+" is divisible by 7");
            }
            A++;
        }

        i =1;
        sum =0;
        while(i<=n){
            if (n % i == 0) {

                sum = sum + i;
                System.out.println(i+" is divisor of "+n);
            }
            i++;
        }
        System.out.println("Sum of all divisors of  "+n+" : "+sum);

        int maxDigit =0;
        temp =n;
        while(temp>0){
            maxDigit= Math.max(maxDigit,temp%10);
            temp=temp/10;
        }


        System.out.println("max digit from "+n +" is: "+maxDigit );






    }







}