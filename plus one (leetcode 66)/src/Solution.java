import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9)
        {
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }
        else
        {
            int c=1;
            for(int i=digits.length-1;i>=0;i--)
            {
                int s=digits[i]+c;
                c=s/10;
                digits[i]=s%10;
            }
            if(c==1)
            {
                int temp[]=new int[digits.length+1];
                temp[0]=1;
                for(int i=0;i<digits.length;i++)
                {
                    temp[i+1]=digits[i];
                }
                c=0;
                return temp;
            }
            else
                return digits;
        }
    }
    public static void main(String args[])
    {
    	Solution obj=new Solution();
    	int a[]= {5,6,7,8,9};
    	System.out.println("Before: "+Arrays.toString(a));
    	int b[]=obj.plusOne(a);
    	System.out.println("After: "+Arrays.toString(b));
    }
}