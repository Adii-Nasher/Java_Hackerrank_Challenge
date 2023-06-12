import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {
    // Create a stack and a queue to store the characters of the input string
    LinkedList<Character> charStack = new LinkedList<Character>();
    LinkedList<Character> charQueue = new LinkedList<Character>();
    
    // Method to add a character to the top of the stack
    public void pushCharacter(char ch){
        charStack.push(ch);
    }
    
    // Method to add a character to the end of the queue
    public void enqueueCharacter(char ch){
        charQueue.add(ch);
    }
    
    // Method to remove and return the character at the top of the stack
    public char popCharacter(){
        return charStack.pop();
    }
    
    // Method to remove and return the character at the front of the queue
    public char dequeueCharacter(){
        return charQueue.remove();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from the user
        System.out.print("Enter a word to check if it's a palindrome: ");
        java.lang.String input = scanner.nextLine();
        scanner.close();

        // Convert input String to an array of characters:
        char[] charArray = input.toCharArray();

        // Create a PalindromeChecker object:
        Palindrome checker = new Palindrome();

        // Add each character of the input string to the stack and the queue
        for (char ch : charArray) {
            checker.pushCharacter(ch);
            checker.enqueueCharacter(ch);
        }

        // Compare the characters at the beginning and end of the string, moving inwards until all characters have been compared
        boolean isPalindrome = true;
        for (int i = 0; i < charArray.length/2; i++) {
            if (checker.popCharacter() != checker.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        // Print whether the input string is a palindrome or not
        if (isPalindrome) {
            System.out.println(input + " is a palindrome!");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

