public class Solution {
	public static int numTeams(int[] rating) {
        int count = 0;
        for(int j=0;j<rating.length;j++)
        {
            int smallerLeft = 0, biggerLeft = 0;
            int smallerRight = 0, biggerRight = 0;
            for(int i=j-1;i>=0;i--)
            {
                if(rating[i]<rating[j])
                {
                    smallerLeft++;
                }
                else if(rating[i]>rating[j])
                {
                    biggerLeft++;
                }
            }
            for(int k=j+1;k<rating.length;k++)
            {
                if(rating[k]<rating[j])
                {
                    smallerRight++;
                }
                else if(rating[k]>rating[j])
                {
                    biggerRight++;
                }
            }
            count += smallerLeft * biggerRight + biggerLeft * smallerRight;
        }
        return count;
    }
	public static void main(String[] args) {
		int [] rating = {2,5,3,4,1};
		System.out.print(numTeams(rating));
	}
}