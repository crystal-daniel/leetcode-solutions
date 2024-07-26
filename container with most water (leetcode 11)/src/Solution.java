public class Solution {
	public static int maxArea(int[] height) {
        int l = 0;
        int h = height.length - 1;
        int max = 0;
        while(l<=h)
        {
            int amount = (h-l) * Math.min(height[l], height[h]);
            max = Math.max(max, amount);
            if(height[l]<height[h])
            {
                l++;
            }
            else
            {
                h--;
            }
        }
        return max;
    }
	public static void main(String[] args) {
		int [] height = {1,8,6,2,5,4,8,3,7};
		System.out.print(maxArea(height));
	}
}