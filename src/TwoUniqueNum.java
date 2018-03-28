public class TwoUniqueNum{
	public void FindNumsAppearOnce(int [] array,int[] num1,int[] num2) {
		if(array.length<2)
			return;
		int length=array.length;
		int temp=0;
		for(int i=0;i<length;i++) {
			temp ^=array[i];
		}
		if(temp==0)
			return;
		if(temp==1)
			return;
		int index=0;
		while((temp&1)==0 && index<32) {
			temp=temp>>1;
			index++;
		}
		for(int i=0;i<length;i++) {
			if(((array[i]>>index)&1)==0)
				num1[0]^=array[i];
			else
				num2[0]^=array[i];
		}
	}
}