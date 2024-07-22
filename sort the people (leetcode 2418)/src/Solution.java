import java.util.Arrays;

public class Solution {
	public static String[] sortPeople(String[] names, int[] heights) {
        sort(names, heights, 0, names.length-1);
        return names;
    }
    static void sort(String[] names, int[] heights, int l, int r)
    {
        if(l<r)
        {
            int m = (l+r)/2;
            sort(names, heights, l, m);
            sort(names, heights, m+1, r);
            merge(names, heights, l, m, r);
        }
    }
    static void merge(String[] names, int[] heights, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        String Ls[] = new String[n1];
        int R[] = new int[n2];
        String Rs[] = new String[n2];

        for(int i=0;i<n1;i++)
        {
            L[i] = heights[l+i];
            Ls[i] = names[l+i];
        }
        for(int j=0;j<n2;j++)
        {
            R[j] = heights[m+1+j];
            Rs[j] = names[m+1+j];
        }
        int i = 0, j = 0;
        int k = l;
        while(i<n1 && j<n2)
        {
            if(L[i]>=R[j])
            {
                heights[k] = L[i];
                names[k] = Ls[i];
                i++;
            }
            else
            {
                heights[k] = R[j];
                names[k] = Rs[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            heights[k] = L[i];
            names[k] = Ls[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            heights[k] = R[j];
            names[k] = Rs[j];
            j++;
            k++;
        }
    }
	public static void main(String[] args) {
		String [] names = {"Mary","John","Emma"};
		int [] heights = {180,165,170};
		sortPeople(names, heights);
		System.out.println(Arrays.toString(names));
	}
}