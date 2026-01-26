// Last updated: 1/26/2026, 4:31:57 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int a=0;
        int b=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]<10){
                a+=nums[i];
            }
            else{
                b+=nums[i];
            }
        }
        return a!=b;
    }
}