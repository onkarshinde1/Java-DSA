public class maxElem {
    public static void main(String[] args) {
        int[] arr = { 22, 33, 44, 55, 66, 11 };
        System.out.println(max(arr));
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                max = arr[i];
            }
        }
        return max;
    }
}
