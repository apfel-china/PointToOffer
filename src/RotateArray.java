public class RotateArray {
	public static void main(String[] args) {
		int[] array= {4,6,1,2,3,4};
		System.out.println(minNumberInRotateArray(array));
	}
    public static int minNumberInRotateArray(int[] array) {
    	if(array.length==0)
    		return 0;
    	if(array.length==1)
    		return array[0];
        int indexofhead=0;
        int indexoftail=array.length-1;
        int indexMid=indexofhead;//for the sase that the array is convey by oder
        while(array[indexoftail]<=array[indexofhead]) {
        	if(indexoftail-indexofhead==1) {
        		indexMid=indexoftail;
        		break;
        	}
        	indexMid=(indexoftail+indexofhead)/2;
        	if(array[indexoftail]==array[indexofhead]&&array[indexofhead]==array[indexMid])
        		return minNumber(array);
        	else if(array[indexofhead]<=array[indexMid])
        			indexofhead=indexMid;
        	else
        		indexoftail=indexMid;
        	
        }
        return array[indexMid];
    }
    public static int minNumber(int[] array) {
    	int indexMid=0;
    	int lengthofArray=array.length;
    	for(int i=0;i<lengthofArray-1;i++) {
    		if(array[i]<array[i+1])
    			indexMid=i;
    	}
    	return array[indexMid];
    	
    }
}