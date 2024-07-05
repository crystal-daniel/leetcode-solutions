import java.util.*;

public class Solution {
	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isSelfDividing(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
    static boolean isSelfDividing(int num)
    {
        int temp = num;
        while(num!=0)
        {
            int a = num % 10;
            if(a==0)
            {
                return false;
            }
            else if(temp%a != 0)
            {
                return false;
            }
            num /= 10;
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(47, 85));
	}
}
