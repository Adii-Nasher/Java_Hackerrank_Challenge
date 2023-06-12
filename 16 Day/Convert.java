import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) { // create a new scanner object to read user input
            System.out.print("Please enter a number: ");
            int number = scanner.nextInt(); // read an integer from user input
            System.out.println("You entered: " + number); // print the number entered by the user
        } catch (Exception e) { // if any exception occurs
            System.out.println("Oops! Something went wrong. Please enter a valid number."); // display an error message
        }
    }
}

