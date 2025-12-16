public class subArrsum{
    public static void main(String[] args) {
        int[][] accounts = {
            {2,8,7},
            {7,1,3},
            {1,9,5}
        };

        System.out.println(subArrsum1(accounts));
    }

    public static int subArrsum1(int[][] accounts){
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum  = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return  max;
    }
}