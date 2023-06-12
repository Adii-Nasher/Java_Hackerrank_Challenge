import java.util.Scanner;

public class Multiplication {
private static final Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
    System.out.print("Enter a number to generate multiplication table: ");
    int number = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    System.out.println("Multiplication Table for " + number + ":");

    for (int multiplier = 1; multiplier <= 10; multiplier++) {
        int product = number * multiplier;
        System.out.println(number + " x " + multiplier + " = " + product);
    }

    scanner.close();
}
}