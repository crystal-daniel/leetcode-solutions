public class Solution {
	public static int findGCD(int[] nums) {
        int a=nums[0];
        int b=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<b)
                b=nums[i];
            if(nums[i]>a)
                a=nums[i];
        }
        int c;
        do
        {
            c=a%b;
            if(c==0)
                return b;
            a=b;
            b=c;
        }while(c!=0);
        return b;
    }
	public static void main(String[] args) {
		int [] nums = {2,5,6,9,10};
		System.out.println(findGCD(nums));
	}
}