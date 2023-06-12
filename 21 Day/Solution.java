import java.util.*;

class ArrayPrinter <Test> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param array A generic array
    **/
    
    public <ElementType> void printArray(ElementType[] generic) {
        for (ElementType item : generic) {
            System.out.println(item);
        }
    }
}

class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the integer array: ");
        int intArraySize = scanner.nextInt();
        Integer[] intArray = new Integer[intArraySize];
        System.out.println("Enter the elements of the integer array: ");
        for (int i = 0; i < intArraySize; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the string array: ");
        int stringArraySize = scanner.nextInt();
        String[] stringArray = new String[stringArraySize];
        System.out.println("Enter the elements of the string array: ");
        for (int i = 0; i < stringArraySize; i++) {
            stringArray[i] = scanner.next();
        }
        
        ArrayPrinter<Integer> intPrinter = new ArrayPrinter<Integer>();
        ArrayPrinter<String> stringPrinter = new ArrayPrinter<String>();
        System.out.println("Printing the integer array:");
        intPrinter.printArray(intArray);
        System.out.println("Printing the string array:");
        stringPrinter.printArray(stringArray);
        if (ArrayPrinter.class.getDeclaredMethods().length > 1) {
            System.out.println("The ArrayPrinter class should only have 1 method named printArray.");
        }
    } 
}
