public class Solution {
	public static int nonSpecialCount(int l, int r) {
        int count = 0;
        for(int i=l; i<=r; i++)
        {
            if(!properDivisors(i))
                count++;
            else
            	System.out.println(i);
        }
        return count;
    }
    static boolean properDivisors(int n)
    {
        int count = 0;
        for(int i=1;i<=Math.ceil(Math.sqrt(n));i++)
        {
            if(n%i==0)
            {
            	//System.out.println(i);
                count++;
            }
        }
        if(count == 2)
        {
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		System.out.println(nonSpecialCount(4,16));
		//properDivisors(8);
	}
}