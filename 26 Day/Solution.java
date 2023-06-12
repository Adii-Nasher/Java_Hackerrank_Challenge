import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the actual return date (day month year): ");
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();

            System.out.print("Enter the expected return date (day month year): ");
            int dayExpected = scanner.nextInt();
            int monthExpected = scanner.nextInt();
            int yearExpected = scanner.nextInt();

            int fine = 0;
            if(year > yearExpected){
                fine = 10000;
            }else if(year == yearExpected && month > monthExpected){
                fine = (month - monthExpected) * 500;
            }else if(year == yearExpected && month == monthExpected && day > dayExpected){
                fine = (day - dayExpected) * 15;
            }

            System.out.println("The fine is: " + fine);
        }
    }
}

