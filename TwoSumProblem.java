import java.util.Arrays;

public class TwoSumProblem {
    static int[] arr = {3, 87, 1, 6, 2, 7, 1, 6, 3, 12, 19, 90};
     static int givenNo = 2;
    public static void main(String[] args){
        System.out.println("Array: " + Arrays.toString(arr));

        if(TwoSumProblemMethod()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean TwoSumProblemMethod() {

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == givenNo){
                    return true;
                }
            }
        }

        return false;
    }
}
