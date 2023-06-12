import java.util.*;

// Create an interface for Advanced Arithmetic calculations
interface AdvancedArithmetic {
    int calculateDivisorSum(int number);
}

// Implement the AdvancedArithmetic interface in the Calculator class
class Calculator implements AdvancedArithmetic {
    public int calculateDivisorSum(int number) {
        // A number has no divisors other than itself
        if (number == 1) {
            return number;
        }

        // Find and sum divisors of the number
        int halfNumber = number / 2; // Divide the number by 2 to make calculations more efficient
        int sumOfDivisors = number; // Initialize the sum of divisors as the number itself
        do {
            if (number % halfNumber == 0) { // Check if the number is divisible by halfNumber
                sumOfDivisors += halfNumber; // Add the divisor to the sum
            }
        } while (halfNumber-- > 1); // Continue dividing the number until we reach 1

        return sumOfDivisors; // Return the final sum of divisors
    }
}

class Airthmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.print("Enter a number to calculate the sum of its divisors: ");
        int number = scanner.nextInt(); // Read the number from the user
        scanner.close(); // Close the scanner object

        AdvancedArithmetic calculator = new Calculator(); // Create an object of the Calculator class that implements the AdvancedArithmetic interface
        int sumOfDivisors = calculator.calculateDivisorSum(number); // Calculate the sum of divisors of the number using the calculator object
        System.out.println("The sum of divisors of " + number + " is " + sumOfDivisors); // Print the sum of divisors of the number
    }
}

