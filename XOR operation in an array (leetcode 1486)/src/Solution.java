
public class Solution {
	public static int xorOperation(int n, int start) {
        int [] nums = new int[n];
        int res = start;
        for(int i=0;i<n;i++)
        {
            nums[i] = start + 2 * i;
            if(i>0)
            {
                res = res ^ nums[i];
            }
        }
        return res;
    }
	public static void main(String[] args) {
		int n = 4, start = 3;
		System.out.println(xorOperation(n, start));
	}
}
