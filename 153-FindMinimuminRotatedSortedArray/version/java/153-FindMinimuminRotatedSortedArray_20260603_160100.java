// Last updated: 6/3/2026, 4:01:00 PM
1class Solution {
2    public int maxi(int[] piles){
3        int m = 0;//m=Integer.MIN_VALUE
4        for(int i:piles){
5            m = Math.max(m,i);
6        }
7        return m;
8    }
9    public int calculate(int[] piles,int mid){
10        int c = 0;
11        for(int i:piles){
12            //c=Math.ceil(i,mid);
13            c+= (i/mid);
14            if(i % mid != 0) c++;
15        }
16        return c;
17    }
18    public int minEatingSpeed(int[] piles, int h) {
19        int s = 1;
20        int e = maxi(piles);
21        while(s < e){
22            int mid = (s+e)/2;
23            int cal_hours = calculate(piles,mid);
24            if(cal_hours > h) s = mid+1;
25            else e = mid;
26        }
27        return s;
28    }
29}