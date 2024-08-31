public class Solution {
	static boolean isPalindrome(int x){
	    if(x<0)
	    {
	        return false;
	    }
	    else
	    {
	        int a=0,n=0;
	        int temp=x;
	        while(x>0)
	        {
	            a=x%10;
	            n=n*10+a;
	            x=x/10;
	        }
	        if(temp==n)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
	}
	public static void main(String[] args) {
		boolean ans = isPalindrome(121);
		System.out.print(ans);
	}
}