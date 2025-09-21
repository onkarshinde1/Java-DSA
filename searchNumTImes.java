public class searchNumTImes {
    
    public static int searchingNum(int matrix[][], int key) {
        int count = 0;
        for(int i = 0; i< matrix.length;i++){
            for(int j = 0; j< matrix[0].length;j++){
                if(key == matrix[i][j]){
                    System.out.println("key is found at (" + i + " , " + j +")" );
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }



    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 10, 48 },
                { 32, 10, 39, 50 },
        };

        int key = 10;
        searchingNum(matrix, key);
    }
}
