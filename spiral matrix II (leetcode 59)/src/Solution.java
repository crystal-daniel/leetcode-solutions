import java.util.Arrays;

public class Solution {
	public static int[][] generateMatrix(int n) {
        int [][] res = new int[n][n];
        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = n-1;
        int colEnd = n-1;
        int k = 1;
        while(rowBegin<=rowEnd && colBegin<=colEnd)
        {
            for(int i=colBegin;i<=colEnd;i++)
            {
                res[rowBegin][i] = k++;
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++)
            {
                res[i][colEnd] = k++;
            }
            colEnd--;
            if(rowBegin<=rowEnd)
            {
                for(int i=colEnd;i>=colBegin;i--)
                {
                    res[rowEnd][i] = k++;
                }
                rowEnd--;
            }
            if(colBegin<=colEnd)
            {
                for(int i=rowEnd;i>=rowBegin;i--)
                {
                    res[i][colBegin] = k++;
                }
                colBegin++;
            }
        }
        return res;
    }
	public static void main(String[] args) {
		int [][] res = generateMatrix(4);
		for(int[] row: res)
		{
			System.out.println(Arrays.toString(row));
		}
	}
}