public class FirstandLastPosition{
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,5,5,5,6,7,8};
        int target = 5;

        int ans = search(arr , target);
        System.out.println(ans);

    }

    public static int search(int[] arr , int target){
        int first = -1;
        int last = -1;
        for (int i = 0; i< arr.length -1; i++){
            if (arr[i] == target){
                first = i;
                break;
            }
        }
        for (int i = arr.length -1; i >= 0; i--){
            if (arr[i] == target){
                last = i;
                break;
            }
        }
        System.out.println("the first position is " + first);
        System.out.println("the last position is " + last);
        return first;
    }
}