package BitManipulation;

public class NumberIsPowerOfTwoOrNot {
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println("6 is power of two: " + isPowerOfTwo(6));
        System.out.println("16 is power of two: " + isPowerOfTwo(16));
    }
}
