public class InfiniteArraysearhing {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9,13,45,47,56,78,98,120,145,156,178};
        int target = 145;

        int index = findRange(arr, target);
        System.out.println("Element found at index: " + index);
    }

    public static int findRange(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // expand the range
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;

            // avoid array out of bounds
            if (end >= arr.length) {
                end = arr.length - 1;
            }
        }
        return findElem(arr, target, start, end);
    }

    public static int findElem(int[] arr, int target, int start, int end) {

        // normal binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } 
            else if (arr[mid] < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
