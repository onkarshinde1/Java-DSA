public class maxsubarrsum {
// bruteforce tachnique
// time complexity => O(n^3)
    public static void pairs(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k] + "  , ");

                }
                System.out.print("the sum is =>  " + sum + " ");
                if (min > sum) {
                    min = sum;
                }
                if (max < sum) {
                    max = sum;
                }
                tp++;

                System.out.println();
            }

            System.out.println();
        }
        System.out.println("tp = " + tp);
        System.out.println("minimum is " + min);
        System.out.println("maximum is " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        pairs(arr);
    }
}