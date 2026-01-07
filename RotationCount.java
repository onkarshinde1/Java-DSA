public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,0,1,2,3};
        int ans = countRotation(arr);
        System.out.println("Array rotated " + ans + " times.");
    }

    public static int countRotation(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; // index of smallest element
    }
}
