import java.util.Scanner;

public class String {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of strings: ");
    int numberOfStrings = scanner.nextInt();

    scanner.nextLine();

    for (int stringIndex = 0; stringIndex < numberOfStrings; stringIndex++) {
        System.out.print("Enter a string: ");
        java.lang.String inputString = scanner.nextLine();
        char[] inputCharArray = inputString.toCharArray();

        System.out.println("Output: ");
        for (int charIndex = 0; charIndex < inputCharArray.length; charIndex++) {
            if (charIndex % 2 == 0) {
                System.out.print(inputCharArray[charIndex]);
            }
        }

        System.out.print(" ");

        for (int charIndex = 0; charIndex < inputCharArray.length; charIndex++) {
            if (charIndex % 2 != 0) {
                System.out.print(inputCharArray[charIndex]);
            }
        }

        System.out.println();
    }

    scanner.close();
}
}