import java.util.Arrays;

public class Solution {
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            ans[i] = findNextGreatest(nums1[i], nums2);
        }
        return ans;
    }
    static int findNextGreatest(int n, int [] nums2)
    {
        int index=0;
        for(int i=0;i<nums2.length;i++)
        {
            if(n==nums2[i])
            {
                index = i;
                break;
            }
        }
        for(int i=index+1;i<nums2.length;i++)
        {
            if(nums2[i]>n)
            {
                return nums2[i];
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int [] nums1 = {4,1,2}, nums2 = {1,3,4,2};
		System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
	}
}
