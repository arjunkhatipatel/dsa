import java.util.Arrays;

public class TransposeOfAMatrix {
    static int[][] arr = {  {5, 6, 1, 9},
                                {3, 6, 8, 4},
                                {8, 2, 6, 0},
                            };

    public static void main(String[] args) {
        System.out.println("Array before: ");
        printArr();

        transposeArr();


    }

    private static void transposeArr() {
        int [][] arr2 = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr2[j][i] = arr[i][j];
            }
        }
        System.out.println("\nArray after: ");
        for (int i = 0; i < arr2.length; i++){
            String out = "";
            for( int  j = 0; j < arr2[i].length; j++){
                out += " " + arr2[i][j];
            }
            System.out.println(out);
        }
    }

    private static void printArr() {
        for (int i = 0; i < arr.length; i++){
            String out = "";
            for( int  j = 0; j < arr[i].length; j++){
                out += " " + arr[i][j];
            }
            System.out.println(out);
        }
    }
}
