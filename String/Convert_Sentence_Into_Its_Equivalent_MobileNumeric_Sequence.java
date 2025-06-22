package String;

public class Convert_Sentence_Into_Its_Equivalent_MobileNumeric_Sequence {

    static String printSequence(String[] arr, String input){
        StringBuilder result = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == ' '){
                result.append("0");
            }
            else{
                int position = input.charAt(i) - 'A';
                result.append(arr[position]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] str
                = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };

        String input = "GEEKSFORGEEKS";
        System.out.println(printSequence(str, input));
    }
}
