public class AdvBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = { -20, -15, -8, -3, 0, 4, 9, 15, 22, 30 };
        int[] arr2 = { 30, 22, 15, 9, 4, 0, -3, -8, -15, -20 };
        int target = 9;
        int ans1 = search(arr1, target);
        int ans2 = search(arr2, target);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
