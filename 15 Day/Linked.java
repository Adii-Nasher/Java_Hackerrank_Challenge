import java.util.*;

// Define a class for the nodes of the linked list
class Node {
    int data; // Data stored in the node
    Node next; // Pointer to the next node in the list

    // Constructor for creating a new node with the given data
    Node(int d) {
        data = d;
        next = null;
    }
}

class Linked{
    // Method for inserting a new node at the end of the list
    public static Node insert(Node head, int data) {
        // If the list is empty, create a new node and return it
        if (head == null) {
            return new Node(data);
        }

        // Otherwise, iterate through the list to find the tail node,
        // and add the new node as the next node after the tail
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = new Node(data);

        // Return the head node of the updated list
        return head;
    }

    // Method for displaying the elements of the list
    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    // Main method for testing the linked list
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the list
        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        // Read the elements and add them to the list
        Node head = null;
        for (int i = 0; i < N; i++) {
            System.out.print("Enter element #" + (i+1) + ": ");
            int element = scanner.nextInt();
            head = insert(head, element);
        }

        // Display the elements of the list
        System.out.print("The elements in the list are: ");
        display(head);

        // Close the scanner to free up resources
        scanner.close();
    }
}

