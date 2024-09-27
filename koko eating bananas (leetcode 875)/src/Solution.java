public class Solution {
	public static int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;
        for(int n: piles)
        {
            maxSpeed = Math.max(maxSpeed, n);
        }
        while(minSpeed<maxSpeed)
        {
            int mid = minSpeed + (maxSpeed - minSpeed)/2;
            if(hoursToEat(piles, mid)==h)
            {
                maxSpeed = mid;
            }
            else if(hoursToEat(piles, mid)<h)
            {
                maxSpeed = mid;
            }
            else
            {
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }
    static int hoursToEat(int [] piles, int speed)
    {
        int hours = 0;
        for(int n: piles)
        {
            hours = hours + (int)Math.ceil((double)n/speed);
        }
        return hours;
    }
	public static void main(String[] args) {
		int piles[] = {30,11,23,4,20}, h = 6;
		System.out.println(minEatingSpeed(piles, h));
	}
}