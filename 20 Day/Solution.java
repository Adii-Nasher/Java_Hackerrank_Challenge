import java.util.*;

public class Solution {

    public static int sortAndCountSwaps(int[] arr, int length){
        int numSwaps = 0;
        for (int currentIndex = 0; currentIndex < length; currentIndex++) {
            int swapsInIteration = 0;
            
            for (int nextIndex = 0; nextIndex < length - 1; nextIndex++) {
                if (arr[nextIndex] > arr[nextIndex + 1]) {
                    // Swap elements
                    int temp = arr[nextIndex+1];
                    arr[nextIndex+1] = arr[nextIndex];
                    arr[nextIndex] = temp;
                    
                    swapsInIteration++;
                    numSwaps++;
                }
            }
            
            if (swapsInIteration == 0) {
                // If no swaps made in iteration, array is sorted
                break;
            }
        }
        return numSwaps;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array length and elements
        System.out.print("Enter length of array: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        
        System.out.println("Enter array elements:");
        for (int currentIndex = 0; currentIndex < arrayLength; currentIndex++) {
            array[currentIndex] = scanner.nextInt();
        }
        
        scanner.close();
        
        // Sort array and count swaps
        int numSwaps = sortAndCountSwaps(array, arrayLength);
        
        // Print results
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[arrayLength-1]);
    }
}
