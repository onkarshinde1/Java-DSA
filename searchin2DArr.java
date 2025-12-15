import java.util.Arrays;

public class searchin2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 12, 14, 15, 51 },
                { 11, 16, 17, 18 },
                { 6, 7, 9 },
                { 555 },
                { 45, 89, 99 }
        };
        int target = 555;
        int[] ans = (search(arr, target));
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int curr = arr[row][col];
                if (curr == target) {
                    return new int[] { row , col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}
