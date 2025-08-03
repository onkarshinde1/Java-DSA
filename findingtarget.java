public class findingtarget {


    public static int findindex(int arr[], int key){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end ) / 2;

            if(arr[mid] == key){
                return mid;
            }
            if (arr[start] <= arr[mid]) {
                // Target left sorted part me hai?
                if (key >= arr[start] && key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // ✅ Right half sorted hai
            else {
                // Target right sorted part me hai?
                if (key > arr[mid] && key <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int key = 0;

        int index = findindex(nums, key);
        System.out.println("Target index: " + index);
    }
}
