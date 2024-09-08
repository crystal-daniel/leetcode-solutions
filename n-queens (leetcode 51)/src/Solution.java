import java.util.*;
public class Solution {
	int c;
    int [] x;
    List<List<String>>sol=new ArrayList<>();
    void solution(int n)
    {
        List<String>s1=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            String s="";
            for(int j=1;j<=n;j++)
            {
                if(x[i]==j)
                {
                    s=s+'Q';
                }
                else
                {
                    s=s+'.';
                }
            }
            s1.add(s);
        }
        sol.add(s1);
    }
    boolean place(int k, int i)
    {
        for(int j=1;j<k;j++)
        {
            if((x[j]==i) || (Math.abs(x[j]-i)==Math.abs(j-k)))
                return false;
        }
        return true;
    }
    void NQueens(int k, int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(place(k,i))
            {
                x[k]=i;
                if(k==n)
                {
                    solution(n);
                }
                else
                {
                    NQueens(k+1,n);
                }
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        x = new int[n+1];
        NQueens(1,n);
        return sol;
    }
	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println(obj.solveNQueens(4));
	}
}