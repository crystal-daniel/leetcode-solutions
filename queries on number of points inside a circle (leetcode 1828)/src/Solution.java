import java.util.Arrays;

public class Solution {
	public static int[] countPoints(int[][] points, int[][] queries) {
        int [] res = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int radius = queries[i][2];
            for(int j=0;j<points.length;j++)
            {
                int x2 = points[j][0];
                int y2 = points[j][1];
                if((Math.pow((x1-x2),2)+Math.pow((y1-y2),2))<=Math.pow(radius,2))
                {
                    res[i]++;
                }
            }
        }
        return res;
    }
	public static void main(String[] args) {
		int [][] points = {{1,3},{3,3},{5,3},{2,2}}, queries = {{2,3,1},{4,3,1},{1,1,2}};
		System.out.println(Arrays.toString(countPoints(points, queries)));
	}
}
