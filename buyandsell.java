public class buyandsell {

    public static int BuysellStock(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if(buyPrice < price[i]){
               int profit = price[i] - buyPrice;
               maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price [] ={7, 1, 5, 3, 6,  4};

        System.out.println(BuysellStock(price));
       
    }
}
