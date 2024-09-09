public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {4, 6, 8, 3, 1, 9, 0};

        if(linearSearch(arr, 3)){
            System.out.println("3 is in array.");
        }

    }

    private static boolean linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }

}
