import java.util.*;
public class Solution {
	static int findSum(int n)
    {
        if(n/10==0)
            return n*n;
        else
            return ((n%10)*(n%10))+findSum(n/10);
    }
    public static boolean isHappy(int n) {
        Set<Integer> check = new HashSet<>();
        int sum=0;
        while(n!=1)
        {
            sum=findSum(n);
            if(sum==1)
                return true;
            else if(check.contains(sum))
                return false;
            check.add(sum);
            n=sum;
        }
        return true;
    }
	public static void main(String[] args) {
		if(isHappy(19))
			System.out.println("It is a happy number");
		else
			System.out.println("It is not a happy number");
	}
}
