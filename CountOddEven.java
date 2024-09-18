import java.util.Arrays;

public class CountOddEven {
    static int[] arr = {4, 6, 2, 87, 3, 2, 8, 3, 9};

    public static void main(String[] args){
        System.out.println("Array: " + Arrays.toString(arr));

        Count();
    }

    private static void Count() {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);

    }
}
