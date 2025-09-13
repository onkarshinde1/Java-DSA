import java.util.Arrays;
import java.util.Collections;

public class inBuiltsort {



    public static void printArr(Integer arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Integer arr[] = { 1, 3, 5, 9, 8, 6, 2, 4, 7 };
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
        

    }
}
