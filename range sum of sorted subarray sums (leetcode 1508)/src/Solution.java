import java.util.*;
public class Solution {
	public static int rangeSum(int[] nums, int n, int left, int right) {
		List<Integer> list = new ArrayList<>();
        int sum;
        for(int i=0;i<n;i++)
        {
            sum = 0;
            for(int j=i;j<n;j++)
            {
                sum += nums[j];
                list.add(sum);
            }
        }
        Collections.sort(list);
        sum = 0;
        int mod = ((int)Math.pow(10,9))+7;
        for(int i=left-1;i<right;i++)
        {
            sum = (sum % mod) + list.get(i);
        }
        return sum % mod;
    }
	public static void main(String[] args) {
		int nums[] = {1,2,3,4}, n = 4, left = 1, right = 5;
		System.out.print(rangeSum(nums, n, left, right));
	}
}