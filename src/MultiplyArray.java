
public class MultiplyArray {
	public int[] multiply(int[] A) {
        int length=A.length;
        int[] B=new int[length];
        if(length!=0){
            B[0]=1;
            for(int i=0;i<length-1;i++){
                B[i+1]=B[i]*A[i];
            }
            int temp=1;
            for(int i=length-1;i>0;i--){
                temp*=A[i];
                B[i-1]=B[i-1]*temp;
            }
        }
        return B;
    }
}
