class Solution {
    public static void mergesort(int [] a,int low, int high)
    {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            mergesort(a,low,mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void merge(int [] a, int low, int mid, int high)
    {
        int i,j,k;
        int n1=mid-low+1;
        int n2=high-mid;
        int [] l = new int[n1];
        int [] r = new int[n2];
        for (i = 0; i < n1; i++) {
            l[i] = a[low+i];
        }
        for (j = 0; j < n2; j++) {
            r[j] = a[mid+1+j];
        }
        i=0;
        j=0;
        k=low;
        while(i<n1 && j<n2)
        {
            if(l[i]<=r[j])
            {
                a[k]=l[i];
                i++;
            }
            else
            {
                a[k]=r[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            a[k]=l[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k]=r[j];
            j++;
            k++;
        }
    }
    public static int majorityElement(int[] nums) {
        mergesort(nums,0,nums.length-1);
        int c=1;
        int n=nums[0];
        int i;
        for(i=1;i<nums.length;i++)
        {
            if(nums[i]==n)
            {
                c++;
            }
            else
            {
                if(c>(nums.length/2))
                    return n;
                else
                {
                	n=nums[i];
                    c=1;
                }
            }
        }
        return nums[i-1];
    }
    public static void main(String args[])
    {
    	int nums[] = {3,3,4};
    	System.out.println(majorityElement(nums));
    }
}