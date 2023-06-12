import java.util.*;
import java.io.*;

class PhoneBook {
    public static void main(String []args){

    Scanner scanner = new Scanner(System.in);
    Map<String, Integer> phoneBook = new HashMap<String, Integer>();

    System.out.print("Enter the number of entries: ");
    int n = scanner.nextInt();

    // Prompt the user to enter contact details
    for(int i = 0; i < n; i++){
        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter phone number: ");
        int phone = scanner.nextInt();

        // Add the contact details to the phone book
        phoneBook.put(name, phone);
    }

    // Prompt the user to search for a contact
    System.out.println("Enter the name of the person you want to search for: ");

    // Search for the contact details and display them
    while(scanner.hasNext()){
        java.lang.String name = scanner.next();
        if(phoneBook.containsKey(name)){
            System.out.println(name + "=" + phoneBook.get(name));
        }
        else{
            System.out.println("Contact not found");
        }
        System.out.println("Enter the name of the person you want to search for: ");
    }
    scanner.close();
}
}