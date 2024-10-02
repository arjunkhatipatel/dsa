import java.util.Arrays;

public class ShuffleArray {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args){
        System.out.println("Array before: " + Arrays.toString(arr));

        shuffleArray();

        System.out.println("Array after: " + Arrays.toString(arr));
    }

    private static void shuffleArray() {
        int temp;
//        for (int i = 0; i < arr.length; i++){
//            int index = (int) (Math.random() * arr.length);
//            temp = arr[i];
//            arr[i] = arr[index];
//            arr[index] = temp;
//        }

//        Fisher-Yates shuffle algorithm
         for (int i = arr.length - 1 ; i > 0; i--){
            int index = (int) (Math.random() * (i + 1));
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
