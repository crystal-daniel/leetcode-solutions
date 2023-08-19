
public class Solution {
	static int calculate(int n,int k)
    {
        if(n==1)
            return 0;
        return (calculate(n-1,k)+k)%n;
    }
    public static int findTheWinner(int n, int k) {
        int ans = calculate(n,k);
        return ans+1;
    }
	public static void main(String args[])
	{
		
		int result=findTheWinner(5,2);
		System.out.println(result);
	}
}
