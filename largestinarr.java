public class largestinarr {

    public static int getLargest(int arr[]) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("smallest value is " + min);
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 44, 55, 66, 77, 88, 99, 33, 22, 11 };
        System.out.println("largest value is " + getLargest(arr));
    }
}
