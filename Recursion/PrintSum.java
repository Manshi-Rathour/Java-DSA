package Recursion;

public class PrintSum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sn = n + sum(n-1);
        return sn;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
