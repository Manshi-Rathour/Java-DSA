package String;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String firstname = sc.next();
//        System.out.println("First Name: " + firstname);

//        String fullname = sc.nextLine();
//        System.out.println("Full Name: " + fullname);

        // concatenation
        String firstname = "Tony";
        String lastname = "Stark";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        // length
        System.out.println(fullname.length());

        // charAt
        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }

        // compare
        String name1 = "Tony";
        String name2 = "Tony";

        if (name1.compareTo(name2) == 0){
            System.out.println("Strings are equal.");
        }
        else{
            System.out.println("Strings are not equal.");
        }

        // substring
        String sentence = "My name is Tony.";
        String name = sentence.substring(11, sentence.length()-1);
        System.out.println(name);   // Tony

        String fullName = "Tony Stark";
        String firstName = fullName.substring(0,4);
        System.out.println(firstName);  // Tony

    }
}
