import java.util.*;

public class Weird {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = scanner.nextInt();            
    String result = "";
    
    if(number % 2 == 1) {
        result = "Weird";
    } else {
        if(number > 2 && number <= 5) {
            result = "Not Weird";
        }
        if(number > 5 && number <= 20) {
            result = "Weird";
        } else {
            result = "Not Weird";
        }
    }
    
    System.out.println("The number " + number + " is " + result);
    scanner.close();

}

}