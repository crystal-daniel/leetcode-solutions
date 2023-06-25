public class Solution {
    public static boolean checkPerfectNumber(int num) {
        int s=0;
        for(int i=1;i*i<num*i;i++)
        {
            if(num%i==0)
            {
            	System.out.println(i);
            	s += i;
            	System.out.println(s);
            }
                
        }
        if(s==num)
            return true;
        return false;
    }
    public static void main(String args[])
    {
    	System.out.print(checkPerfectNumber(33550336));
    }
}