package Recursion;

public class TowerOfHanoi {
    public static int toh(int n, String src, String helper, String dest){
        int count = 0;
        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return 1;
        }

        count += toh(n-1, src, dest, helper);
        count++;
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        count += toh(n-1, helper, src, dest);

        return count;
    }
    public static void main(String[] args) {
        int n = 5;
        int moves = toh(n, "Source", "Helper", "Destination");
        System.out.println("Total moves: " + moves);
    }
}
