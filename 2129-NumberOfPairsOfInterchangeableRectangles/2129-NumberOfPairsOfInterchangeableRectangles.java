// Last updated: 1/26/2026, 4:32:33 PM
class Solution {
    public long interchangeableRectangles(int[][] rectangles) 
    {
        long res = 0;
        Map<Double,Integer> rec = new HashMap();
        int count = 0;
        for(int[] i : rectangles){
            double ratio = (double) i[0] / i[1];
            res = res + rec.getOrDefault(ratio,0);
            rec.put(ratio,rec.getOrDefault(ratio,0) + 1);
        }   
        return res;  
    }
}