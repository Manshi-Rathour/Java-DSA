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
    }
}
