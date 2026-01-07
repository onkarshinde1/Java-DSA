public class binarySearch {

    public static int findElem(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid +1 ] == key) {
                return mid + 1;
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
        int arr[] = { 4,5,6,7,0,1,2,3};
        int key = 2;
        System.out.println("the element is found at index "+ findElem(arr, key));
    }
}
