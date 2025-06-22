package Recursion;

public class CalPowerStackHeightLogN {
    public static int calPower(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        int halfPower = calPower(x, n/2);
        int halfPowSq = halfPower * halfPower;

        // n is odd
        if(n%2 != 0){
            halfPowSq = x * halfPowSq;
        }

        return halfPowSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        System.out.println(calPower(x, n));
    }
}
