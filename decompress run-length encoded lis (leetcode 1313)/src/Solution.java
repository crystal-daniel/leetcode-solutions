import java.util.*;
public class Solution {
	public static int[] decompressRLElist(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length-1;i=i+2)
        {
            int freq = nums[i];
            int val = nums[i+1];
            while(freq!=0)
            {
                temp.add(val);
                freq--;
            }
        }
        int [] res = new int[temp.size()];
        int i = 0;
        for(int n: temp)
        {
            res[i++] = n;
        }
        return res;
    }
	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		System.out.println(Arrays.toString(decompressRLElist(nums)));
	}
}