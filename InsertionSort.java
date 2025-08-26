import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {

    public static void Insertion(Integer arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding correct position for curr
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;

            }
            // Insertion
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr, Collections.reverseOrder());

        // Insertion(arr);
        printArr(arr);
    }
}
