public class Solution {
	static int c;
    static int [] x;
    static boolean place(int k, int i)
    {
        for(int j=1;j<k;j++)
        {
            if((x[j]==i) || (Math.abs(x[j]-i)==Math.abs(j-k)))
                return false;
        }
        return true;
    }
    static void NQueens(int k, int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(place(k,i))
            {
                x[k]=i;
                if(k==n)
                {
                    c++;
                }
                else
                {
                    NQueens(k+1,n);
                }
            }
        }
    }
    public static int totalNQueens(int n) {
        x=new int[n+1];
        NQueens(1,n);
        return c;
    }
	public static void main(String[] args) {
		System.out.println(totalNQueens(8));
	}
}