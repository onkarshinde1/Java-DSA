public class floorNum {

    // floor number => the imidiate smaller number before the target elem
    public static void main(String[] args) {
       int[] arr = {-45, -32, -18, -10, -3, 0, 4, 7, 12, 18, 23, 29, 35, 41, 56, 63, 71, 84, 92, 105};

        int ans = floor(arr, -45);
        System.out.println(ans);
    }

    public static int floor(int[] arr ,int target){
        
        int start = 0;
        int end = arr.length-1;
        //if the target element is smaller than the smallest number in array it should return the -1
        // boundry condition
        if(target < start){
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) /2;

            if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid -1;
            }

        }
        return end;
    }
}
