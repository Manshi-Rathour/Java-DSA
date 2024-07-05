package Recursion;

public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicates(str, idx+1, newStr);
        }
        else{
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "abbcdcceefe";
        removeDuplicates(str, 0, "");
    }
}
