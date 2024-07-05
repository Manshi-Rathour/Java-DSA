package BitManipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to update either 0 or 1: ");
        int oper = sc.nextInt();

        int n = 5;   // 0101
        int pos = 1;
        int bitMask = 1 << pos;    // 0001 << 1 = 0010

        if(oper == 1){
            // set
            int newNum = bitMask | n;
            System.out.println(newNum);
        }
        else {
            // clear
            int newBM = ~bitMask;
            int newNum = newBM & n;
            System.out.println(newNum);
        }
    }
}
