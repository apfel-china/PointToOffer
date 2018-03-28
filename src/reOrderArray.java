
public class reOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generat;
		int[] a= {1,2,3,4,5};
		reorderArray(a);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);

	}
    public static void reorderArray(int [] array) {
        if(array.length==0||array.length==1)
            return;
        int[] arraytemp=new int[array.length];
        int oddcount=0,oddbegin=0,lengthofarray=array.length;
        for(int i=0;i<lengthofarray;i++){
            if((array[i]&1)==1)
                oddcount++;
        }
        for(int i=0;i<lengthofarray;i++){
            if((array[i]&1)==1)
                arraytemp[oddbegin++]=array[i];
            else
                arraytemp[oddcount++]=array[i];
        }
        for(int i=0;i<lengthofarray;i++)
            array[i]=arraytemp[i];
    }

}
