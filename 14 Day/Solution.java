// Import necessary libraries
import java.util.*;


// Define a class named "Difference"
class Difference {
  	// Define class variables
  	private int[] elements;
  	public int maximumDifference;

	// Define a constructor that takes an array of integers as an argument
	public Difference(int[] nums) {
  		elements = nums;
 	}

 	// Define a method to compute the maximum difference between any two elements in the array
	public void computeDifference() {
  		// Sort the array in ascending order
  		Arrays.sort(elements);
  		// Compute the maximum difference as the difference between the last and first elements in the sorted array
  		maximumDifference = elements[elements.length - 1] - elements[0];
 	}
} // End of Difference class


public class Solution {
	// Define the main method
    public static void main(String[] args) {
        // Prompt the user to enter the number of elements in the array
        System.out.println("Enter the number of elements in the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Create a new array of integers with n elements
        int[] a = new int[n];
        // Prompt the user to enter each element of the array
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        // Create a new instance of the Difference class with the input array as an argument
        Difference difference = new Difference(a);
        // Call the computeDifference() method to compute the maximum difference between any two elements in the array
        difference.computeDifference();
        // Print the maximum difference between any two elements in the array
        System.out.println("The maximum difference between any two elements in the array is: " + difference.maximumDifference);
    }
}
