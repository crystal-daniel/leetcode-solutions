import java.util.Arrays;
public class Solution {
	public static int[] singleNumber(int[] nums) {
        int c=0;
        int [] num=new int[2];
        int k=0;
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
                num[k++]=nums[i];
            c=0;
        }
        return num;
	}
	public static void main(String[] args) {
		int [] num = {1,2,1,3,2,5};
		int [] ans = singleNumber(num);
		System.out.print(Arrays.toString(ans));
	}
}