package Tree;

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
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int value : values){
            root = insert(root, value);
        }

        inorder(root);
        System.out.println();

        if(search(root, 3)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }

        delete(root, 4);
        inorder(root);
    }
}
