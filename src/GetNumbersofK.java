
public class GetNumbersofK {
	public int GetNumberOfK(int [] array , int k) {
		if(array==null)
			return 0;
		int numbers=0;
		int first=GetFirst(array,k,0,array.length-1);
		int last=GetLast(array,k,0,array.length-1);
		if(first>-1 && last>-1)
			numbers=last-first+1;
		return numbers;
    }
	
	private int GetFirst(int[] array,int k,int start,int end) {
		if(start>end)
			return -1;
		int middle=(start+end)>>1;
		if(array[middle]==k) {
			if((middle>0 && array[middle-1]!=k ) || middle==0)
				return middle;
			else
				end=middle-1;
		}
		else if(array[middle]>k)
			end=middle-1;
		else
			start=middle+1;
		return GetFirst(array,k,start,end);
	}
	
	private int GetLast(int[] array,int k,int start,int end) {
		if(start>end)
			return -1;
		int middle=(start+end)>>1;
		if(array[middle]==k) {
			if((middle<end && array[middle+1]!=k ) || middle==end)
				return middle;
			else
				start=middle+1;
		}
		else if(array[middle]>k)
			end=middle-1;
		else
			start=middle+1;
		return GetLast(array,k,start,end);
	}
}
