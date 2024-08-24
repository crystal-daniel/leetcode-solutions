import java.util.Arrays;
import java.util.*;
public class Solution {
//	public static int[] createTargetArray(int[] nums, int[] index) {
//        int [] target = new int[nums.length];
//        for(int i=0;i<nums.length;i++)
//        {
//            for(int j=nums.length-1;j>index[i];j--)
//            {
//            	target[j] = target[j-1];
//            }
//            target[index[i]] = nums[i];
//        }
//        return target;
//    }
	public static int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> list = new ArrayList<>();
        int [] target = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            list.add(index[i], nums[i]);
        }
        for(int i = 0; i<list.size();i++)
        {
        	target[i] = list.get(i);
        }
        return target;
    }
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,0}, index = {0,1,2,3,0};
		System.out.println(Arrays.toString(createTargetArray(nums, index)));
	}

}