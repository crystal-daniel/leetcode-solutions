public class Solution {
	public static int commonFactors(int a, int b) {
        int c=0;
        int len=a;
        if(len>b)
            len=b;
        for(int i=1;i<=len;i++)
        {
            if((a%i == 0) && (b%i==0))
                c++;
        }
        return c;
    }
	public static void main(String[] args) {
		System.out.println(commonFactors(12,6));
	}
}
