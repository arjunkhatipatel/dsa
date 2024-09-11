public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,};

        if (binarySearch(arr, 5)) {
            System.out.println("5 is in array.");
        }

        if (binarySearchRecusive(arr, 0, 9, 8)) {
            System.out.println("8 is in array");
        }
    }

    private static boolean binarySearchRecusive(int[] arr, int start, int end, int target) {
        if (start > end) {
            return false;
        }

        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] > target) {
            end = mid;
            return binarySearchRecusive(arr, start, end - 1, target);
        } else {
            start = mid;
            return binarySearchRecusive(arr, start + 1, end, target);
        }
    }

    private static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
