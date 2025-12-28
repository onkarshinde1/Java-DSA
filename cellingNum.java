public class cellingNum {

    // celling number => the imidiate greater number after the target elem   
    public static void main(String[] args) {
        int[] arr = {-45, -32, -18, -10, -3, 0, 4, 7, 12, 18, 23, 29, 35, 41, 56, 63, 71, 84, 92, 105};

        int ans = celling(arr, 45);
        System.out.println(ans);
    }

    public static int celling(int[] arr ,int target){
        
        int start = 0;
        int end = arr.length-1;
        //if the target element is greater than the gretest number in array it should return the -1
        // boundry condition
        if(target > end){
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
        return start;
    }
}
