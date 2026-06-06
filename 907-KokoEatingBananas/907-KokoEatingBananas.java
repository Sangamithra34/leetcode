// Last updated: 6/6/2026, 11:11:12 AM
class Solution {
    public int maxi(int[] piles){
        int m = 0;//m=Integer.MIN_VALUE
        for(int i:piles){
            m = Math.max(m,i);
        }
        return m;
    }
    public int calculate(int[] piles,int mid){
        int c = 0;
        for(int i:piles){
            //c=Math.ceil(i,mid);
            c+= (i/mid);
            if(i % mid != 0) c++;
        }
        return c;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = maxi(piles);
        while(s < e){
            int mid = (s+e)/2;
            int cal_hours = calculate(piles,mid);
            if(cal_hours > h) s = mid+1;
            else e = mid;
        }
        return s;
    }
}