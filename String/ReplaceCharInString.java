package String;

import java.util.Scanner;

public class ReplaceCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalStr = sc.next();
        String result = "";

        for(int i=0; i<originalStr.length(); i++){
            if(originalStr.charAt(i) == 'e'){
                result += 'i';
            }
            else {
                result += originalStr.charAt(i);
            }
        }
        System.out.println(result);
    }
}
