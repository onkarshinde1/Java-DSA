public class binarySearch {

    public static int findElem(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        int key = 776;
        System.out.println("the element is found at index "+findElem(arr, key));
    }
}
