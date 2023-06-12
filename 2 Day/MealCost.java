import java.util.Scanner;

public class MealCost {

    static void calculateBill(double mealCost, int tipPercent, int taxPercent) {
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        int totalCost = (int) Math.round(mealCost + tip + tax);
        System.out.println("The total cost of the meal is: $" + totalCost);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost of the meal: $");
        double mealCost = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the percentage you would like to tip: ");
        int tipPercent = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the tax rate: ");
        int taxPercent = scanner.nextInt();
        scanner.nextLine();

        calculateBill(mealCost, tipPercent, taxPercent);

        scanner.close();
    }
}
