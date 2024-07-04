
public class Solution {
	public static boolean isSameAfterReversals(int num) {
        int rev1 = reverse(num);
        if(num == reverse(rev1))
        {
            return true;
        }
        return false;
    }
    static int reverse(int n)
    {
        int temp = n, rev = 0;
        while(temp!=0)
        {
            int a = temp%10;
            rev = rev*10 + a;
            temp/=10;
        }
        return rev;
    }
	public static void main(String[] args) {
		System.out.println(isSameAfterReversals(1800));
	}
}
