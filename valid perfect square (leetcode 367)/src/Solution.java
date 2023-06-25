
public class Solution {
	public static boolean isPerfectSquare(int num) {
        int x=(int)Math.round(Math.exp(Math.log(num)/2));
        if(x*x==num)
            return true;
        return false;
    }
	public static void main(String[] args) {
		boolean ans=isPerfectSquare(16);
		System.out.print(ans);
	}
}
