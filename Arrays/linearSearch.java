public class linearSearch {

    public static int checknum(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = { 44, 55, 66, 77, 88, 99, 33, 22, 11 };
        int key = 333;
        int index = checknum(arr, key);
        if(index == -1){
            System.out.println("key not found");
        }else{
            System.out.println("key is at index: " + index);
        }
    }
}
