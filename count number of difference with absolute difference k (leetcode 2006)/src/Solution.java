
public class Solution {
	public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(Math.abs(nums[i]-nums[j])==k)
                    count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		int nums[] = {3,2,1,5,4}, k = 2;
		System.out.print(countKDifference(nums, k));
	}
}
