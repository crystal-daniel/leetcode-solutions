import java.util.*;
public class Solution {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null)
            return false;
        Map<Integer,Integer> sike = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!sike.containsKey(nums[i]))
            {
                sike.put(nums[i],i);
            }
            else
            {
                if((i-sike.get(nums[i]))<=k)
                {
                    return true;
                }
                else
                    sike.replace(nums[i],i);
            }
        }
        return false;
    }
	public static void main(String[] args) {
		int [] nums = {1,2,3,1};
		int k = 3;
		System.out.print(containsNearbyDuplicate(nums, k));
	}
}
