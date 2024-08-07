import java.util.*;
public class Solution {
	 public static int[][] kClosest(int[][] points, int k) {
	        int[][] res = new int[k][2];

	        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> (x[0] * x[0] + x[1] * x[1]) - (y[0] * y[0] + y[1] * y[1]));

	        for (int[] p : points) {
	            pq.offer(p);
	        }

	        for (int i = 0; i < k; i++) {
	            res[i] = pq.poll();
	        }

	        return res;
	    }
	public static void main(String[] args) {
		int [][] points = {{3, 3},{5, -1},{-2, 4}}, res;
		res = kClosest(points, 2);
		for(int [] row: res)
		{
			System.out.print(Arrays.toString(row));
		}
	}
}