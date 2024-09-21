import java.util.Arrays;

public class FindMissingNumber {
    static int[] arr = {1, 2, 4, 6, 3, 7, it};
    static int N = 8;

    public static void main(String[] args) {
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("Missing number is: " + findMissingNumber());
    }

    private static int findMissingNumber() {
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1) {
                return arr[i] - 1;
            }
        }
        return N;
    }
}
