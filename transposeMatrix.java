import java.util.Scanner;

public class transposeMatrix {

    public static void getArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows :");
        int n = sc.nextInt();
        System.out.print("enter colums :");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        int transMatrix[][] = new int[m][n];
        System.out.print("enter arr :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
                // System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }

        // printing arr 
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transMatrix[i][j] + " ");
            }
            System.out.println();
        }
    
    }

    public static void main(String[] args) {
        getArr();
        // transpose(trans);
    }
}
