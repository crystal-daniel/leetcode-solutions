public class Solution {
	public static int trap(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0;
        }
        int [] left = new int[n], right = new int[n];
        int l = 1, r = n-2;
        left[0] = height[0];
        right[n-1] = height[n-1];
        while(l<n && r>=0)
        {
            left[l] = Math.max(left[l-1], height[l]);
            right[r] = Math.max(right[r+1], height[r]);
            l++;
            r--;
        }
        int water = 0;
        for(int i=0;i<n;i++)
        {
            water += (Math.min(left[i], right[i]) - height[i]);
        }
        return water;
    }
	public static void main(String[] args) {
		int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.print(trap(height));
	}
}