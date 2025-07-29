public class reverseArr {

    public static void reverse(int arr[]){
        int start = 0 ; int end = arr.length-1;
        while(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;

        }
    }

    public static void main(String[] args) {
          int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

        System.out.println(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
