public class maxsubarrsum1 {
    public static void pairs(int arr[]) {
        int prefix[] = new int[arr.length];
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (max < currSum) {
                    max = currSum;
                }
            }
        }
        System.out.println("maximum is " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        pairs(arr);
    }
}
