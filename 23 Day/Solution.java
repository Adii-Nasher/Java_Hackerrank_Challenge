import java.util.*;

class Node{
    Node left, right;
    int data;
    
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

class Solution{
    static LinkedList<Integer> queue = new LinkedList();
    
    // A method to print a binary tree in level order
    static void levelOrder(Node root){
        // Create a queue to store the nodes of the tree
        LinkedList<Node> treeQueue = new LinkedList();
        
        // Add the root node to the queue
        treeQueue.add(root);
        
        // Loop until the queue is empty
        while(treeQueue.peek() != null) {
            // Remove the first node in the queue
            Node toPrint = treeQueue.remove();
            
            // Print the data of the node
            System.out.print(toPrint.data);
            
            // Add the left and right children of the node to the queue if they exist
            if(toPrint.left != null) {
                treeQueue.add(toPrint.left);
            }
            if(toPrint.right != null) {
                treeQueue.add(toPrint.right);
            }
            
            // If there are more nodes in the queue, print a space
            if(treeQueue.peek() != null) {
                System.out.print(" ");
            }
        }
    }

    public static Node insert(Node root, int data){
        // If the root node is null, create a new node with the given data and return it
        if(root == null){
            return new Node(data);
        }
        // Otherwise, insert the data in the appropriate place in the tree
        else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    
    public static void main(String args[]){
        try (// Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in)) {
            // Ask the user to enter the number of nodes in the tree
            System.out.println("Enter the number of nodes in the tree:");
            int numNodes = sc.nextInt();
            
            // Create a new root node
            Node root = null;
            
            // Insert each node into the tree
            System.out.println("Enter the values of the nodes:");
            while(numNodes-- > 0){
                int data = sc.nextInt();
                root = insert(root, data);
            }
            
            // Print the tree in level order
            System.out.println("The tree in level order is:");
            levelOrder(root);
        }
    }	
}

