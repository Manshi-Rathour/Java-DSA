package BitManipulation;

public class GetBit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;      // 0001 << 2 = 0100

        if((bitMask & n) == 0){
            System.out.println("Bit was zero");
        }
        else {
            System.out.println("Bit was one");
        }
    }
}
