import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        System.out.print("Original String :");
        for(int i : arr){
            System.out.print(i + " ");
        }
        reverse(arr);
        System.out.println();
        System.out.print("Reversed String :");
        printArr(arr);

    }

    static int reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }

        return 0;

    }

    static void printArr(int[] arr) {
        for( int i : arr){
            System.out.print(i + " ");
        }
    }

}
