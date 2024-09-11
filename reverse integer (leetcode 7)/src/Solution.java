public class Solution {
//	public int reverse(int x) {
//	       String val = Integer.toString(Math.abs((long)x));
//	       StringBuilder value = new StringBuilder(val);
//	       int start = 0;
//	       int end = val.length()-1;
//	       while(start<=end)
//	       {
//	            char temp = val.charAt(start);
//	            value.setCharAt(start,val.charAt(end));
//	            value.setCharAt(end,temp);
//	            start++;
//	            end--;
//	       }
//	       val = value.toString();
//	       if((x*-1)>0)
//	       {
//	        val = "-"+val;
//	       }
//	       long n = Long.valueOf(val);
//	       if(n>(Math.pow(2,31)-1) || n<-Math.pow(2,31))
//	       {
//	        return 0;
//	       }
//	       else {
//	        return (int)n;
//	       }
//	    }
	public static int reverse(int x) {
	      long reverse = 0;
	        int temp;

	        while (x != 0) {
	            temp = x % 10;
	            reverse = reverse * 10 + temp;
	            x = x / 10;

	            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
	                return 0;
	            }
	        }

	        return (int)reverse;
	      
	    }
	public static void main(String[] args) {
		int x = -2147483648;
		System.out.println(reverse(x));
	}
}