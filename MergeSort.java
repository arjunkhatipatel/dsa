import java.util.Arrays;

public class MergeSort {
    static int[] arr = {3, 87, 1, 6, 2, 7, 1, 6, 3, 12, 19, 90};
    public static void main (String[] args){
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        DoMergeSort(arr, 0, arr.length - 1);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    private static void DoMergeSort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;

            DoMergeSort(arr, start, mid);
            DoMergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] leftArr = Arrays.copyOfRange(arr, start, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, end + 1);

        int i = 0, j = 0, k = start;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy any remaining elements of rightArr, if any
        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    }
}
