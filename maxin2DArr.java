public class maxin2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 12, 14, 15, 51 },
                { 11, 16, 17, 18 },
                { 6, 7, 9 },
                { 555 },
                { 45, 89, 99 }
        };

        System.out.println(max(arr));

    }

    public static int max(int[][] arr){
        int maximum = Integer.MIN_VALUE;
        for (int[] ints : arr){
            for(int anInts : ints){
                if(anInts > maximum){
                    maximum = anInts;
                
                }
            }
        }
        return maximum;
    }
}
