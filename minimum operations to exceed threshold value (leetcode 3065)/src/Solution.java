public class Solution {
	public static int minOperations(int[] nums, int k) {
        int count = 0;
        for(int n: nums)
        {
            if(n<k)
            {
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		int nums[] = {2,11,10,1,3}, k = 10;
		System.out.print(minOperations(nums, k));
	}
}
