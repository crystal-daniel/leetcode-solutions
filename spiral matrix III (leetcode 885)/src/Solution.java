import java.util.Arrays;

public class Solution {
	public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int directions[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int n = rows*cols;
        int res[][] = new int[n][2];
        res[0][0] = rStart;
        res[0][1] = cStart;
        int count = 1;
        int step = 1;
        int index = 0;
        while(count<n)
        {
            for(int times=0;times<2;times++)
            {
                int dr = directions[index%4][0];
                int dc = directions[index%4][1];
                for(int i=0;i<step;i++)
                {
                    rStart += dr;
                    cStart += dc;
                    if(rStart>=0 && rStart<rows && cStart>=0 && cStart<cols)
                    {
                        res[count][0] = rStart;
                        res[count][1] = cStart;
                        count++;
                    }
                }
                index++;
            }
            step++;
        }
        return res;
    }
	public static void main(String[] args) {
		int rows = 5, cols = 6, rStart = 1, cStart = 4;
		int [][] res = spiralMatrixIII(rows, cols, rStart, cStart);
		for(int[] row: res)
		{
			System.out.print(Arrays.toString(row));
		}
	}
}