import java.util.*;

public class twodArr {

    // search method (void return)
    public static void search(int matrix[][], int key) {
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at (" + i + "," + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Key not found!");
        }
    }

    public static void main(String args[]) {
        System.out.println("java connected....!!!");

        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // print matrix
        System.out.println("Matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // search key
        int key = 5;
        search(matrix, key); // call method directly
    }
}
