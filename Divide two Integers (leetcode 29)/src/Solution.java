class Solution {
    public static int divide(int dividend, int divisor) {
        if(dividend>0 && divisor>0)
        	return (int)Math.round(Math.exp(Math.log(dividend)-Math.log(divisor)));
        else if(dividend>0 && divisor<0)
        	return -(int)Math.round(Math.exp(Math.log(dividend)-Math.log(-divisor)));
        else if(dividend<0 && divisor>0)
        	return -(int)Math.round(Math.exp(Math.log(-dividend)-Math.log(divisor)));
        else if(dividend<0 && divisor<0)
        	return (int)Math.round(Math.exp(Math.log(-dividend)-Math.log(-divisor)));
        else
        	return 0;
    }
    public static void main(String args[])
    {
    	System.out.println(divide(-12,2));
    }
}