
public class Solution {
	public static String maximumOddBinaryNumber(String s) {
        int numberOfZeros = 0, numberOfOnes = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                numberOfZeros++;
            }
            else
            {
                numberOfOnes++;
            }
        }
        String res = "";
        for(int i=0;i<numberOfOnes-1;i++)
        {
            res = res + "1";
        }
        for(int i=0;i<numberOfZeros;i++)
        {
            res = res + "0";
        }
        res = res + "1";
        return res;
    }
	public static void main(String args[])
	{
		System.out.println(maximumOddBinaryNumber("0101"));
	}
}
