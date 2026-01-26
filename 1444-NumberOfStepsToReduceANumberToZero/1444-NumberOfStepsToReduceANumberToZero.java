// Last updated: 1/26/2026, 4:32:46 PM
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            count++;
        }
        return count;    
    }
}