package Trie;

public class Trie {

    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            for(int i=0; i<26; i++){
                children[i] = null;
            }

            eow = false;
        }
    }

    static Node root = new Node();

    // insert - 0(L) - L : length of word
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true; // Mark the end of the word
    }

    // search - 0(L) - L : length of word
    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false; // Character path does not exist
            }
            curr = curr.children[idx];
        }
        return curr.eow; // Check if it’s the end of a valid word
    }
    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};

        for(int i=0; i< words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("their"));
        System.out.println(search("an"));
        System.out.println(search("thor"));
    }
}
