import java.util.Arrays;
import java.util.Collections;

public class ArrayWave {
    static Integer[] arr = {5, 6, 1, 9, 3, 6, 8, 4};

    public static void main(String[] args) {
        System.out.println("Array Before: " + Arrays.toString(arr));

        SortArrayWave();

        System.out.println("Array After: " + Arrays.toString(arr));
    }

    private static void SortArrayWave(){
        Arrays.sort(arr, Collections.reverseOrder());

        int temp;
        for (int i = 1; i < arr.length; i = i + 2){
            temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;

        }
    }
}
