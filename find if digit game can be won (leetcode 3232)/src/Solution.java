
public class Solution {
	public static boolean canAliceWin(int[] nums) {
        int singleSum = 0;
        int doubleSum = 0;
        for(int n: nums)
        {
            if(n/10 == 0)
            {
                singleSum += n;
            }
            else
            {
                doubleSum += n;
            }
        }
        if(singleSum != doubleSum)
        {
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,14};
		System.out.print(canAliceWin(nums));
	}
}
