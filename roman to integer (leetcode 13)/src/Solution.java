
public class Solution {
	public static int convert(char ch)
	{
		int val=0;
		switch(ch)
        {
            case 'I': val=1;
                      break;
            case 'V': val=5;
                      break;
            case 'X': val=10;
                      break;
            case 'L': val=50;
                      break;
            case 'C': val=100;
                      break;
            case 'D': val=500;
                      break;
            case 'M': val=1000;
                      break;
        }
		return val;
	}
    public static int romanToInt(String s) {
        int ans=convert(s.charAt(s.length()-1));
        for(int i=s.length()-1;i>0;i--)
        {
            char ch=s.charAt(i);
            char pre=s.charAt(i-1);
            if(convert(pre)<convert(ch))
            {
                ans=ans-convert(pre);
            }
            else
            {
                ans=ans+convert(pre);
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		int ans = romanToInt("MCMXCIV");
		System.out.print(ans);
	}
}
