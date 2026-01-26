// Last updated: 1/26/2026, 4:32:42 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinked = 0;
        int eb = 0; 
        
        while (numBottles > 0) {
            drinked += numBottles;   
            eb += numBottles;       
            numBottles = eb / numExchange; 
            eb = eb % numExchange;         
        }
        return drinked;
    }
}