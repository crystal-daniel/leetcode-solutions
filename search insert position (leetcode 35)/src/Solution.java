
public class Solution {
	public static int searchInsert(int[] nums, int target) {
        int last=nums.length-1;
        int first=0;
        int mid=0;
        while(first<=last)
        {
            mid=(first+last)/2;
            if(nums[mid]==target)
                break;
            else if(nums[mid]>target)
                last=mid-1;
            else
                first=mid+1;
        }
        if(nums[mid]==target || nums[mid]>target)
            return mid;
        else
            return mid+1;
    }
	public static void main(String[] args) {
		int [] nums = {1,3,5,6};
		int target = 5;
		int ans = searchInsert(nums,target);
		System.out.println(ans);
	}
}
