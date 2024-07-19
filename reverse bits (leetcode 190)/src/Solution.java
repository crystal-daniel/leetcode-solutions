
public class Solution {
	public static int reverseBits(int n) {
        String binary = Integer.toString(n);
        if(binary.length()<32)
        {
            for(int i=0;i<32-binary.length();i++)
            {
                binary = "0" + binary;
            }
        }
        int pow = 0;
        int res = 0;
        while(pow<binary.length())
        {
            char c = binary.charAt(pow);
            if(c=='1')
            {
                res = res + (int)Math.pow(2,pow);
            }
            pow++;
        }
        return res;
    }
	public static void main(String[] args) {
		System.out.println(reverseBits(10100101000001111010011100));
	}
}
