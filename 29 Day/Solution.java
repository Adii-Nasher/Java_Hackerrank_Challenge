import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of test cases: ");
        int numberOfTestCases = scanner.nextInt();

        for (int testCase = 1; testCase <= numberOfTestCases; testCase++) {
            System.out.print("Enter the value of n for test case " + testCase + ": ");
            int numberOfElements = scanner.nextInt();

            System.out.print("Enter the value of k for test case " + testCase + ": ");
            int upperBound = scanner.nextInt();

            int maxAndValue = 0;
            for(int index1 = 0; index1 < numberOfElements; index1++){
                for(int index2 = index1+1; index2 <= numberOfElements; index2++){
                    int andValue = index1 & index2;
                    if(andValue < upperBound && andValue > maxAndValue){
                        maxAndValue = andValue;
                    }
                }
            }

            System.out.println("Max AND value for test case " + testCase + ": " + maxAndValue);
        }
        
        scanner.close(); 
    }  
}

