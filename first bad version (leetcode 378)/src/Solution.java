
public class Solution {
	int [] badVersion = {4,5};
	public int firstBadVersion(int n) {
        int bad=0;
        int start = 1;
        int end = n;
        int mid=0;
        while(start<=end)
        {
        	mid = (start+end)/2;
            if(!isBadVersion(mid))
            {
                start=mid+1;
            }
            else
            {
                bad=mid;
                end = mid-1;
            }
        }
        return bad;
    }
	
	private boolean isBadVersion(int temp) {
		for(int item: badVersion)
		{
			if(item==temp)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Solution obj = new Solution();
		System.out.println(obj.firstBadVersion(5));
	}
}
