import java.util.*;
public class sumofArr {

    public static int sumOfArr(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        int matrix[][] = new int [n][m];
        for(int i =0; i<n;i++){
            for(int j =0; j< m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        int sum = 0;
        for(int j=0; j<m;j++){
            sum += matrix[1][j];
        }
        System.out.println("the sum is "+sum);
        return sum;
        
    }

    public static void main(String[] args){
        sumOfArr();
    }
}
