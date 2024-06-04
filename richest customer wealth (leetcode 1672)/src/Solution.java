
public class Solution {
	public static int maximumWealth(int[][] accounts) {
        int richest = 0;
        int sum = 0;
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
            {
                sum = sum + accounts[i][j];
            }
            richest=Math.max(sum, richest);
            sum=0;
        }
        return richest;
    }
	public static void main(String[] args) {
		int [][] accounts = {{1,2,3},{3,2,1}};
		System.out.println(maximumWealth(accounts));
	}
}
