package Trie;

public class WordBreakProblem {
    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secPart = key.substring(i);

            if (Trie.search(firstPart) && wordBreak(secPart)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        String[] words = {"i", "like", "sam", "samsung", "mobile"};
//        String key = "ilikesamsung";
        String[] words = {"b"};
        String key = "a";

        for(int i=0; i<words.length; i++){
            Trie.insert(words[i]);
        }
        System.out.println(wordBreak(key));
    }
}
