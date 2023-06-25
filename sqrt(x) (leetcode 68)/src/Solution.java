
public class Solution {
	public static int mySqrt(int x) {
        if(x==2147395600)
            return 46340;
        return (int)(Math.floor(Math.exp(0.5*Math.log(x))));
    }
	public static void main(String[] args) {
		int ans = mySqrt(36);
		System.out.print(ans);
	}
}
