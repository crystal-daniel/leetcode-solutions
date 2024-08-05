import java.util.*;
public class Solution {
	public static int findMaxK(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int n: nums)
        {
            list.add(n);
        }
        int max = -1;
        for(int n: nums)
        {
            if(n>max && list.contains(-n))
            {
                max = n;
            }
        }
        return max;
    }
	public static void main(String[] args) {
		int [] nums = {-1,10,6,7,-7,1};
		System.out.println(findMaxK(nums));
	}
}