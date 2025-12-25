public class floorNum {

    // floor number => the imidiate smaller number before the target elem
    public static void main(String[] args) {
        int[] arr = {-20, -15, -8, -3, 0, 4, 9, 15, 22, 30 };
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
