import java.util.Scanner;

public class Matrix {
public static void main(String[] args) {
try (Scanner scanner = new Scanner(System.in)) {
    // Prompt user for input matrix
    System.out.println("Please enter a 6x6 matrix of integers:");

    int[][] matrix = new int[6][6];
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
            matrix[i][j] = scanner.nextInt();
        }
    }

    // Find the maximum hourglass sum in the matrix
    int maxHourglassSum = findMaxHourglassSum(matrix);

    // Display the result to the user
    System.out.println("The maximum hourglass sum in the matrix is: " + maxHourglassSum);
}
}

/**
 * Finds the maximum hourglass sum in the given matrix.
 */
private static int findMaxHourglassSum(int[][] matrix) {
    int maxSum = Integer.MIN_VALUE;

    // Iterate over all hourglasses in the matrix
    for (int i = 0; i <= 3; i++) {
        for (int j = 0; j <= 3; j++) {
            int sum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2]
                    + matrix[i+1][j+1]
                    + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];

            // Check if the sum of the current hourglass is greater than the current maximum sum
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
    }

    return maxSum;
}
}