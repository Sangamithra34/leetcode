// Last updated: 1/26/2026, 4:33:32 PM
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price: prices){
            if(price < minPrice){
                minPrice = price;
            }
            int profit = price - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}