
public class Solution {
	public static boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        double x=Math.log(n)/Math.log(2);
        int y=(int)x;
        if(Math.pow(2,y)==n)
            return true;
         return false;
    }
	public static void main(String[] args) {
		boolean ans = isPowerOfTwo(16);
		System.out.print(ans);
	}
}
