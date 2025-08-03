public class distinctnum {

// Question 1:Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
// .Example 1:Input:nums = [1, 2, 3, 1]Output:   true
//  Example 2:Input:nums = [1, 2, 3, 4]Output:   false
//   Example 3:Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]Output:   true 
//   Constraints:•1 <= nums .  length <= 105
//   -109 <= nums [ i ] <= 10^5


    public static boolean twice(int arr[]){
        for(int i = 0; i<= arr.length-1;i++){
            for(int j = i+1;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
         int[] arr = {5, 3, 8, 52, 2, 9, 1, 34, 7, 6, 6};

         System.out.println(twice(arr));
         if(twice(arr) ==  true){
            System.out.println("twice number found" );
         }else{
            System.out.println("no twice number");
         }
        
    }
}
