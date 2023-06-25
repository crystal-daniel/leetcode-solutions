class Solution {
    public static boolean isPowerOfFour(int n) {
        if(n==0)
            return false;
        double x=Math.log(n)/Math.log(4);
        int y=(int)(x);
        if((int)Math.pow(4,y)==n)
            return true;
         return false;
    }
    public static void main(String args[])
    {
    	System.out.println(isPowerOfFour(16));
    }
}