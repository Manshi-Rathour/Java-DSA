package BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int n = 5;  // 0101
        int pos = 1;
        int bitMask = 1 << pos;     // 0001 << 1 = 0010

        int newNum = bitMask | n;   // 0010 | 0101 = 0111 = 7
        System.out.println(newNum); // 7
    }
}
