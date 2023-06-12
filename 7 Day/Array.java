import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        // Read the size of the array from the user
        int n = scanner.nextInt();

        // Create an array of the given size
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");

        // Read the elements of the array from the user and store them in the array
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // Print the elements of the array in reverse order
        System.out.print("The elements of the array in reverse order are: ");
        for(int i = n - 1; i > -1; i--){
            System.out.print(arr[i] + " ");
        }
    }
}