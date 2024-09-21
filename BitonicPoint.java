import java.util.Arrays;

public class BitonicPoint {
    static int[] arr = {6, 7, 8, 11, 9, 5, 2, 1};

    public static void main(String[] args) {
        System.out.println("Bitonic array: " + Arrays.toString(arr));

        System.out.println("Bitonic point: " + findBitonicPoint());
    }

    private static int findBitonicPoint() {
        int point = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < point) {
                return point;
            } else {
                point = arr[i];
            }
        }
        return -1;
    }
}
