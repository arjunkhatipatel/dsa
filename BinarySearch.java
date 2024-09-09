public class BinarySearch {
        public static void main(String[] args){
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,};

            if(binarySearch(arr, 5)){
                System.out.println("5 is in array.");
            }
        }

        private static boolean binarySearch(int[] arr, int target){
            int start = 0;
            int end = arr.length;
            int mid = (start + end) / 2;
            for (int i = 0; i < arr.length / 2; i++){
                if (arr[mid] == target){
                    return true;
                }else if (arr[mid] > target){
                    end = mid;
                }else {
                    start = mid;
                }
            }
            return false;
        }
    }
