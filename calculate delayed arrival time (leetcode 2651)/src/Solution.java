
public class Solution {
	public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        arrivalTime = arrivalTime + delayedTime;
        if(arrivalTime<24)
        {
            return arrivalTime;
        }
        return arrivalTime-24;
    }
	public static void main(String[] args) {
		System.out.println(findDelayedArrivalTime(15, 5));
	}
}
