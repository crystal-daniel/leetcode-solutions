import java.util.Arrays;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
    public static void main(String args[])
    {
    	int a[]= {1,5,-2,-4,0};
    	System.out.print(containsDuplicate(a));
    }
}