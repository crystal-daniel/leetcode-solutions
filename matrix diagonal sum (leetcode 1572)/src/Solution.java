public class Solution {
	public static int diagonalSum(int[][] mat) {
        int[][] temp=mat;
        int sum=0;
        int j=mat.length-1;
        for(int i=0;i<mat.length;i++)
        {
            sum=sum+temp[i][i];
            temp[i][i]=0;
            sum=sum+temp[i][j--];
        }
        return sum;
    }
	public static void main(String[] args) {
		int [][] mat= {{1,2,3},
		               {4,5,6},
		               {7,8,9}};
		int ans = diagonalSum(mat);
		System.out.print(ans);
	}
}