import java.util.Arrays;

public class MaximumOfAllSubarrays {
    static int[] arr = {1, 2, 3, 1, 4, 5};
    static int target = 3;

    public static void main(String[] args) {
        System.out.println("Array: " + Arrays.toString(arr));

        findMaxOfSubArray();
    }

    private static void findMaxOfSubArray() {
        int result;
        for (int i = 0; i < arr.length - target + 1; i++) {
            result = arr[i];
            for (int j = i; j < i + target; j++) {
                if (arr[j] > arr[i]) {
                    result = arr[j];
                }
            }
            System.out.println(result);
        }
    }
}
