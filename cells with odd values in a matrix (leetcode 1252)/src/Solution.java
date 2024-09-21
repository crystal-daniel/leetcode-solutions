public class Solution {
	public static int oddCells(int m, int n, int[][] indices) {
        int [][] ans = new int[m][n];
        int odd = 0;
        for(int i=0;i<indices.length;i++)
        {
            int j = 0;
            while(j<n)
            {
                ans[indices[i][0]][j]++;
                if(ans[indices[i][0]][j]%2!=0)
                {
                    odd++;
                }
                else
                {
                    odd--;
                }
                j++;
            }
            j = 0;
            while(j<m)
            {
                ans[j][indices[i][1]]++;
                if(ans[j][indices[i][1]]%2!=0)
                {
                    odd++;
                }
                else
                {
                    odd--;
                }
                j++;
            }
        }
        return odd;
    }
	public static void main(String[] args) {
		int m = 2, n = 3, indices[][] = {{0,1},{1,1}};
		System.out.println(oddCells(m, n, indices));
	}
}