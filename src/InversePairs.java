
public class InversePairs {

	public static void main(String[] args) {
		// TODO Auto-generat;
	 
	 

	}
/*
		    public int InversePairs(int [] array) {
		        if(array==null||array.length==0)
		        {
		            return 0;
		        }
		        int[] copy = new int[array.length];
		        for(int i=0;i<array.length;i++)
		        {
		            copy[i] = array[i];
		        }
		        int count = InversePairsCore(array,copy,0,array.length-1);//数值过大求余
		        return count;
		         
		    }
		    private int InversePairsCore(int[] array,int[] copy,int low,int high)
		    {
		        if(low==high)
		        {
		            return 0;
		        }
		        int mid = (low+high)>>1;
		        int leftCount = InversePairsCore(array,copy,low,mid)%1000000007;
		        int rightCount = InversePairsCore(array,copy,mid+1,high)%1000000007;
		        int count = 0;
		        int i=mid;
		        int j=high;
		        int locCopy = high;
		        while(i>=low&&j>mid)
		        {
		            if(array[i]>array[j])
		            {
		                count += j-mid;
		                copy[locCopy--] = array[i--];
		                if(count>=1000000007)//数值过大求余
		                {
		                    count%=1000000007;
		                }
		            }
		            else
		            {
		                copy[locCopy--] = array[j--];
		            }
		        }
		        for(;i>=low;i--)
		        {
		            copy[locCopy--]=array[i];
		        }
		        for(;j>mid;j--)
		        {
		            copy[locCopy--]=array[j];
		        }
		        for(int s=low;s<=high;s++)
		        {
		            array[s] = copy[s];
		        }
		        return (leftCount+rightCount+count)%1000000007;
		    }
		}
		*/
		
}
/*

public class Solution {
    int cnt;
 
    public int InversePairs(int[] array) {
        cnt = 0;
        if (array != null)
            mergeSortUp2Down(array, 0, array.length - 1);
        return cnt;
    }
 
  
    public void mergeSortUp2Down(int[] a, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) >> 1;
 
        mergeSortUp2Down(a, start, mid);
        mergeSortUp2Down(a, mid + 1, end);
 
        merge(a, start, mid, end);
    }
 
   
    public void merge(int[] a, int start, int mid, int end) {
        int[] tmp = new int[end - start + 1];
 
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (a[i] <= a[j])
                tmp[k++] = a[i++];
            else {
                tmp[k++] = a[j++];
                cnt += mid - i + 1;  // core code, calculate InversePairs............
            }
        }
 
        while (i <= mid)
            tmp[k++] = a[i++];
        while (j <= end)
            tmp[k++] = a[j++];
        for (k = 0; k < tmp.length; k++)
            a[start + k] = tmp[k];
    }
}
*/
