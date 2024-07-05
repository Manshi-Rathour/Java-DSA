package Array;

class RepeatAndMissing {
    public int[] repeatedNumber(final int[] A) {
        int[] r = new int[2];

        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
                if(A[i] == A[j]){
                    r[0] = A[i];
                    break;
                }
            }

        }
        // Find the missing number
        boolean[] found = new boolean[A.length + 1];
        for (int num : A) {
            found[num] = true;
        }
        for (int i = 1; i <= A.length; i++) {
            if (!found[i]) {
                r[1] = i;
                break;
            }
        }
        return r;
    }
}

public class Repeat_and_Missing_number {
    public static void main(String[] args) {
        RepeatAndMissing r = new RepeatAndMissing();

        int[] A = {3,1,2,5,3};
        int[] result = r.repeatedNumber(A);
        System.out.println(result);

    }
}
