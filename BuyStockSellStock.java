public class BuyStockSellStock {
    public static int maxProfit(int[] prices, int fee) {
        // need to cover case of no prices
        int n = prices.length;
        if(prices == null || n == 0) return 0;
        
        int buy = prices[0];
        int profit = 0;
        int sell = 0;
        for(int i = 1; i < n; i++){ // start index at 1 because buy is already set
            buy = Math.min(buy, prices[i] - profit);
            sell = Math.max(profit, prices[i] - buy - fee); // profit comparison
            profit = sell;
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1,3,7,5,10,3};
        int fee = 3;
        System.out.println(maxProfit(prices, fee));
    }
}
