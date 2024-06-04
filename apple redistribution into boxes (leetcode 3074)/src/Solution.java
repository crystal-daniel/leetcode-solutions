import java.util.Arrays;

public class Solution {
	public static int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int boxes = 0;
        int sum = 0;
        for(int i=0;i<apple.length;i++)
        {
            sum+=apple[i];
        }
        for(int i=capacity.length-1;i>=0;i--)
        {
            sum = sum - capacity[i];
            boxes++;
            if(sum<=0)
            {
                break;
            }
        }
        return boxes;
    }
	public static void main(String[] args) {
		int [] apple = {1,3,2};
		int [] capacity = {4,3,1,5,2};
		System.out.println(minimumBoxes(apple, capacity));
	}
}
