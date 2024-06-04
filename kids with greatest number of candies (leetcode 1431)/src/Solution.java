import java.util.*;
public class Solution {
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int i=0;i<candies.length;i++)
        {
            max=Math.max(candies[i],max);
        }
        for(int i=0;i<candies.length;i++)
        {
            if((candies[i]+extraCandies)>=max)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
	public static void main(String[] args) {
		int [] candies = {2,3,5,1,3};
		int extraCandies = 3;
		System.out.println(kidsWithCandies(candies, extraCandies));
	}
}
