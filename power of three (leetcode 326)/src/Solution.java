class Solution {
    public static boolean isPowerOfThree(int n) {
        if(n==0)
            return false;
        double x=Math.log(n)/Math.log(3);
        int y=(int)Math.round(x);
        if(Math.pow(3,y)==n)
            return true;
         return false;
    }
    public static void main(String args[])
    {
    	System.out.println(isPowerOfThree(59049));
    }
}