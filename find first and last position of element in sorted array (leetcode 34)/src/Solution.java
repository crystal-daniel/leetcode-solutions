import java.util.*;
public class Solution {
	public static int[] searchRange(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                list.add(i);
        }
        int [] result = new int[2];
        int l = list.size();
        if(l==1)
        {
            result[0] = result[1] = list.get(0);
        }
        else if(l>=2)
        {
            result[0] = list.get(0);
            result[1] = list.get(l-1);
        }
        else
        {
            result[0] = result[1] = -1;
        }
        return result;
    }
	public static void main(String[] args) {
		int [] nums = {5,7,7,8,8,10};
		int target = 8;
		System.out.print(Arrays.toString(searchRange(nums, target)));
	}
}
