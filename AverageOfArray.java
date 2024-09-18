import java.util.Arrays;

public class AverageOfArray {

    static int[] arr = {4, 6, 2, 87, 3, 2, 8, 3, 9};

    public static void main(String[] args){
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println(CalAverage());
    }

    private static int CalAverage() {
        int average = 0;
        for (int i = 0; i < arr.length; i++){
            average += arr[i];
        }

        return average/arr.length;
    }
}
