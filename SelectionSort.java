import java.util.Arrays;

public class SelectionSort {
    static int[] arr = {3, 87, 1, 6, 2, 7, 1, 6, 3, 12, 19, 90};
    public static void main (String[] args){
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        DoSelectionSort();
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    private static void DoSelectionSort() {
        int temp;
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
