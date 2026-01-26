// Last updated: 1/26/2026, 4:32:19 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0, digit=0;
        for(int num:nums){
            sum+= num;
            while(num != 0){
                digit+= num%10;
                num/= 10;
            }
        }
        return Math.abs(sum-digit);
    }
}