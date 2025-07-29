public class subarrays {
    public static void pairs(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ," );
                    sum = sum + arr[k];
                    tp++;
                }

                System.out.print("    => sum of array is  = " +sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total pairs are " + tp);
    }

    public static void main(String args[]) {
        int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

        pairs(arr);

    }
}
