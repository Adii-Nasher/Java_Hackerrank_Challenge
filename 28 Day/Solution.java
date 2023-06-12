import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of records: ");
        int numOfRecords = scanner.nextInt();
        String emailRegex=".+@gmail\\.com$";
        List<String> namesList= new ArrayList();
        Pattern emailPattern=Pattern.compile(emailRegex);
        for(int recordCount = 0; recordCount < numOfRecords; recordCount++){
            System.out.print("Enter name and email address (separated by a space): ");
            String name=scanner.next();
            String email=scanner.next();
            Matcher emailMatcher=emailPattern.matcher(email);
            if(emailMatcher.find()){
                namesList.add(name);
            }
        }
        Collections.sort(namesList);
        System.out.println("\nSorted list of names with Gmail addresses:\n");
        for(String name : namesList){
            System.out.println(name);
        }
        scanner.close();
    }
}
