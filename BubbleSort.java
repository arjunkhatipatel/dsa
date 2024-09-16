import java.util.Arrays;

public class BubbleSort {
    static int[] arr = {3, 87, 1, 6, 2, 7, 12, 6, 3, 12, 19, 90};
    public static void main(String[] args){
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        DoBubbleSort();
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    private static void DoBubbleSort() {
        int size = arr.length;
        int temp;
        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j < size; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
