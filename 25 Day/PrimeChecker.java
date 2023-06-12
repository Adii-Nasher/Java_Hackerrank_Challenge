import java.io.*;
import java.util.*;

public class PrimeChecker {

    static void checkIfPrime(int number) {
        boolean isPrime = false;
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                isPrime = true;
                break;
            }
        }
        if (number == 1) {
            System.out.println("1 is neither prime nor composite");
        } else if (!isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int numberOfTestCases = scanner.nextInt();

        while (numberOfTestCases-- != 0) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            checkIfPrime(number);
        }
    }
}

