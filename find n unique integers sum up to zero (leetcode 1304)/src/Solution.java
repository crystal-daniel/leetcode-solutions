import java.util.*;
public class Solution {
	public static int[] sumZero(int n) {
        TreeSet<Integer> res = new TreeSet<>();
        int count = 0;
        int i = 1;
        if(n%2!=0)
        {
            res.add(0);
            count++;
        }
        while(count<n)
        {
            res.add(i);
            res.add(-i);
            i++;
            count += 2;
        }
        i = 0;
        int ans[] = new int[n];
        for(int num: res)
        {
            ans[i++] = num;
        }
        return ans;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sumZero(5)));
	}
}
