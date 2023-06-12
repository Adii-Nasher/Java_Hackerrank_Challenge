import java.io.IOException;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) throws IOException {
        // Prompt the user to enter a number
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scan.nextInt();
        scan.close();
        
        // Convert the number to binary and count the maximum number of consecutive ones
        char[] binary = Integer.toBinaryString(n).toCharArray();
        int tmpCount = 0;
        int maxCount = 0;
        for(int i = 0; i < binary.length; i++){
            tmpCount = (binary[i] == '0') ? 0 : tmpCount + 1; 
            if(tmpCount > maxCount){
                maxCount = tmpCount;
            }
        }
        
        // Print the result
        System.out.println("The maximum number of consecutive ones in the binary representation of " + n + " is " + maxCount + ".");
    }
}

