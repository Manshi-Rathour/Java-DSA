package Tree;
import java.util.ArrayList;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Searching
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key) {
            return true;
        }
        else if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }
    // Deleting a node
    public static Node delete(Node root, int val){
        if(root == null){
            return null;
        }
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{ // root.data == val
            // case 1: leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2: one child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3: 2 children
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    // Print in Range X and Y
    public static void printInRange(Node root, int X, int Y){
        if(root == null){
            return;
        }
        if(root.data >= X && root.data <= Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        }
        else if(root.data > X){
            printInRange(root.left, X, Y);
        }
        else{
            printInRange(root.right, X, Y);
        }
    }

    // Print all paths from root to leaf
    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        // leaf
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else{  // non leaf
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }

        path.removeLast();
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i : path){
            System.out.print(i + "->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] values = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        // Creating a binary search tree
        for(int value : values){
            root = insert(root, value);
        }

        inorder(root);
        System.out.println();

        // Searching in BST
        if(search(root, 3)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }

        // Deleting a node in BST
        delete(root, 4);
        inorder(root);
        System.out.println();

        // Printing in range X and Y
        printInRange(root, 6, 10);
        System.out.println();

        // Printing all paths from root to leaf
        printRootToLeaf(root, new ArrayList<>());
    }
}
