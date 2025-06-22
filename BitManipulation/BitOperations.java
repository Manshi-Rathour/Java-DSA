package BitManipulation;

public class BitOperations {
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearIthBit(n, i);
        }
        else{
            return setIthBit(n, i);
        }
    }

    public static int clearLastIBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearRangeOfBits(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;
        int bitMask = a|b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(5, 1));

        System.out.println(setIthBit(1, 3));

        System.out.println(clearIthBit(25, 3));

        System.out.println(updateIthBit(4, 1, 1));

        System.out.println(clearLastIBits(9, 3));

        System.out.println(clearRangeOfBits(590, 2, 5));
    }
}
