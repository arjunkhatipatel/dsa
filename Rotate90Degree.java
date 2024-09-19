public class Rotate90Degree {
    static int[][] arr = {
            {5, 6, 1, 9},
            {3, 6, 8, 4},
            {8, 2, 6, 0},
    };

    public static void main(String[] args) {
        System.out.println("Array before: ");
        printArr(arr);

        rotateArr();


    }

    private static void rotateArr() {
        int[][] arr2 = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[j][i] = arr[i][j];
            }
        }

        // reverse row
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length / 2; j++) {
                int temp = arr2[i][j];
                arr2[i][j] = arr2[i][arr2[i].length - j - 1];
                arr2[i][arr2[i].length - j - 1] = temp;
            }
        }

        System.out.println("\nArray after: ");
        printArr(arr2);
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            String out = "";
            for (int j = 0; j < arr[i].length; j++) {
                out += " " + arr[i][j];
            }
            System.out.println(out);
        }
    }
}
