public class Bubblesort {

    public static void Selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swap =0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            System.out.println(swap);
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] =  {42, 7, 19, 3, 88, 15, 60};
        Selection(arr);
        printArr(arr);
    }
}
