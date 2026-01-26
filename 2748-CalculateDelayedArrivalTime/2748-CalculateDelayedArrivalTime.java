// Last updated: 1/26/2026, 4:32:12 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int time=arrivalTime + delayedTime;
        if(time == 24){
            return 0;
        }
        if(time>24){
            return time%24;
        }
        else return time;
    }
}