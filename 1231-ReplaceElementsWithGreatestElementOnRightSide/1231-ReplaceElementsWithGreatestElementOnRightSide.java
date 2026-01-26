// Last updated: 1/26/2026, 4:32:52 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int maxRight=-1;
        for(int i=n-1;i>=0;i--){
            int current=arr[i];
            arr[i] = maxRight;
            if(current>maxRight){
                maxRight = current;
            }
        }
        return arr;
    }
}