public class BuyAndSellStocks {
    

    public static int buyAndSell(int price[]) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
            else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        // int price[] = {7,1,5,3,6,4};
        // int price[] = {7, 6, 4, 3, 1};
        int price[] = {3, 5, 1, 4, 2, 8};
        System.out.println(buyAndSell(price));
    }
}
