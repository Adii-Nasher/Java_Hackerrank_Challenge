import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    public static Node removeDuplicates(Node head) {
        Set<Integer> uniqueValues = new HashSet<Integer>();
        if (head == null) {
            return head;
        }
        uniqueValues.add(head.data);
        Node current = head;
        while (current.next != null) {
            if (uniqueValues.contains(current.next.data)) {
                current.next = current.next.next;
            } else {
                uniqueValues.add(current.next.data);
                current = current.next;
            }
        }
        return head;
    }

    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else if (head.next == null) {
            head.next = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int numElements = scanner.nextInt();
            Node head = null;
            for (int elementIndex = 0; elementIndex < numElements; elementIndex++) {
                System.out.print("Enter element #" + (elementIndex + 1) + ": ");
                int element = scanner.nextInt();
                head = insert(head, element);
            }
            head = removeDuplicates(head);
            System.out.println("The list with duplicates removed:");
            display(head);
        }
    }
}

