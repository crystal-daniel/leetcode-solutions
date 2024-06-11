import java.util.*;
public class Solution {
	public static int countPairs(int [] nums, int target) {
        int count = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])<target)
                    count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		int nums[] = {-1,1,2,3,1}, target = 2;
		System.out.println(countPairs(nums, target));
	}
}
