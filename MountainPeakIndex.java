public class MountainPeakIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 8, 6, 4, 2 };
        int ans = searching(arr);
        System.out.println("onkar shinde");
        System.out.println(ans);
    }

    public static int searching(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;          // ✅ fixed
            } else {
                start = mid + 1;
            }
        }
        return start; // or end (both are same here)
    }
}
