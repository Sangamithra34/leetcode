// Last updated: 1/26/2026, 4:32:05 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0, n = x;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (x % sum == 0) {
            return sum;
        }
        return -1;
    }
}