
public class Solution {
	public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int i=0;i<nums.length;i++)
        {
            elementSum+=nums[i];
            digitSum+=findDigitSum(nums[i]);
        }
        return (int)Math.abs(elementSum-digitSum);
    }
    static int findDigitSum(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            char a = (char)(n%10);
            sum+=a;
            n/=10;
        }
        return sum;
    }
	public static void main(String[] args) {
		int [] nums = {1,15,6,3};
		System.out.println(differenceOfSum(nums));
	}
}
