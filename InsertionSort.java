import java.util.Arrays;

public class InsertionSort {
    static int[] arr = {3, 87, 1, 6, 2, 7, 12, 6, 3, 12, 19, 90};
    public static  void main(String[] args){
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        DoInsertionSort();
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    private static void DoInsertionSort() {
        int temp;
        for (int i = 1; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] < arr[j]){
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                }
            }
        }
    }
}
