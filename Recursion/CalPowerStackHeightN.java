package Recursion;

public class CalPowerStackHeightN {
    public static int calPower(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        int xPownm1 = calPower(x, n-1);
        return x * xPownm1;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        System.out.println(calPower(x, n));
    }
}
