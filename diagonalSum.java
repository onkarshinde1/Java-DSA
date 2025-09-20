public class diagonalSum {

    public static int diaSum(int matrix[][]) {
        int sum = 0;
        // for (int i = 0; i < matrix.length; i++) { // code complexity =>>O(n^2)
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         } else if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        // OPTIMIZED APPROACH
        for(int i =0;i<matrix.length;i++){
            //primary Diagonal
            sum+=matrix[i][i];
            //secondary Diagonal
            // if(i != matrix.length-1-i) // if want a exact sum with counting double elements
                sum +=matrix[i][matrix.length-1-i];
        }
        return sum;
    }

    public static void main(String args[]) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        int result = diaSum(matrix);
        System.out.println(result);

    }
}
