package BitManipulation;

public class OddEvenNumber {
    public static void oddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddEven(3);
        oddEven(10);
        oddEven(2);
        oddEven(5);
    }
}
