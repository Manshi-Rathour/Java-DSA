package Recursion;

public class PrintSum {
    public static void sum(int n, int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        sum += n;
        sum(n-1, sum);
    }
    public static void main(String[] args) {
        sum(5, 0);
    }
}
