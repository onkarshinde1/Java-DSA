public class subarrays {
    public static void pairs(int arr[]) {
        int tp = 0;
        int maxSum = Integer.MIN_VALUE;  // Initially the smallest possible value
        int minSum = Integer.MAX_VALUE;  // Initially the largest possible value

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ,");
                    sum = sum + arr[k];
                }

                // Update max and min sums
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }

                System.out.print("    => sum of array is = " + sum);
                tp++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total pairs (subarrays): " + tp);
        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Minimum subarray sum: " + minSum);
    }

    public static void main(String args[]) {
        int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        pairs(arr);
    }
}
