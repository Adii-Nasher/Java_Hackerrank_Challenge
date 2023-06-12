import java.util.*;

// Create a class for the binary tree node
class Node{
    Node left, right;
    int data;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

// Create a solution class to hold our main function and helper methods
class Solution{
	
	// Helper method to calculate the height of the binary tree
	public static int calculateHeight(Node root){
        // If we've reached the end of a branch, return -1
        if (root == null) {
            return -1;
        }
        // Recursively calculate the height of each subtree
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);
        // Return the maximum height of the left and right subtrees plus one for the root node
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Helper method to insert a new node into the binary tree
    public static Node insert(Node root, int data){
        if (root == null){
            // If we've reached the end of the tree, create a new node with the provided data
            return new Node(data);
        }
        else{
            Node current;
            // If the data is less than or equal to the current node, insert it in the left subtree
            if (data <= root.data){
                current = insert(root.left, data);
                root.left = current;
            }
            // If the data is greater than the current node, insert it in the right subtree
            else{
                current = insert(root.right, data);
                root.right = current;
            }
            return root;
        }
    }

    // Main function to read input and output the height of the binary tree
	 public static void main(String args[]){
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user for the number of nodes to insert
            System.out.print("Enter the number of nodes to insert: ");
            int numNodes = scanner.nextInt();

            // Initialize the binary tree with the first node and insert the remaining nodes
            Node root = null;
            for (int nodeNumber = 0; nodeNumber < numNodes; nodeNumber++){
                System.out.print("Enter the value of node " + (nodeNumber + 1) + ": ");
                int data = scanner.nextInt();
                root = insert(root, data);
            }

            // Calculate and output the height of the binary tree
            int height = calculateHeight(root);
            System.out.println("The height of the binary tree is: " + height);
        }
    }
}
