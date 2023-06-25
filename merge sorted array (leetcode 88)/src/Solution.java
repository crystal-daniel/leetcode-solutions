import java.util.Arrays;

public class Solution {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=m;i<(m+n);i++)
        {
            nums1[i]=nums2[k++];
        }
        for(int i=0;i<m+n-1;i++)
        {
            for(int j=0;j<m+n-i-1;j++)
            {
                if(nums1[j]>nums1[j+1])
                {
                    int temp=nums1[j+1];
                    nums1[j+1]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
    }
	public static void main(String[] args) {
		int [] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6}; 
		int	m = 3, n = 3;
		merge(nums1,m,nums2,n);
		System.out.println(Arrays.toString(nums1));
	}
}
