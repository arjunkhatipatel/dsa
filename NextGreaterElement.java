import java.util.Arrays;

public class NextGreaterElement {
    static int[] arr = {5, 7, 9, 2, 11};
    static int target = 7;

    public static void main(String[] args){
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println(String.format("Next greater element %d of is %d", target, findNextGreater() ));
    }

    private static int findNextGreater() {
        int result = -1;
        for (int i = 0; i < arr.length - 1; i++){
            if(arr[i] == target) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (result == -1 && arr[j] > arr[i]){
                        result = arr[j];
                    }
                    if (arr[j] > arr[i]) {
                        if (result > arr[j])
                            result = arr[j];
                    }
                }
            }
        }
        return result;
    }
}
