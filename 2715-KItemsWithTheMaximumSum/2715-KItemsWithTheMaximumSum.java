// Last updated: 1/26/2026, 4:32:14 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        return Math.min(k, numOnes) - Math.max(0, k - numOnes - numZeros);
    }
}