public class maxElem {
    public static void main(String[] args) {
        int[] arr = { 22, 33, 44, 55, 66, 11 };
        System.out.println(maxRange(arr , 1 , 4));
    }

    public static int maxRange(int[] arr , int start , int end){
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }




    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
