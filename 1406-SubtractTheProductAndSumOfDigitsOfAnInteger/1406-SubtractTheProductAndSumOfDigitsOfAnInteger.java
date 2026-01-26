// Last updated: 1/26/2026, 4:32:47 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }return product - sum;    
    }
}