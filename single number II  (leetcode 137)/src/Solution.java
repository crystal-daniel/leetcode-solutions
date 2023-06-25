public class Solution {
	public static int singleNumber(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(nums[i]==nums[j])
                        c++;
                }
            }
            if(c==0)
                return nums[i];
            c=0;
        }
        return 0;
    }
	public static void main(String[] args) {
		int [] num = {2,2,3,2};
		int ans = singleNumber(num);
		System.out.print(ans);
	}
}
