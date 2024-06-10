import java.util.*;
public class Solution {
	public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        int [] answer = new int[2];
        for(int num: nums1)
        {
            n1.add(num);
        }
        for(int num: nums2)
        {
            n2.add(num);
        }
        for(int num: nums1)
        {
            if(n2.contains(num))
            {
                answer[0]++;
            }
        }
        for(int num: nums2)
        {
            if(n1.contains(num))
            {
                answer[1]++;
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		int [] nums1 = {4,3,2,3,1}, nums2 = {2,2,5,2,3,6};
		System.out.println(Arrays.toString(findIntersectionValues(nums1, nums2)));
	}
}
