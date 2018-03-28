
public class OperationOfAdd {
	public int Add(int num1,int num2) {
        while(num2!=0){
            int directadd=num1^num2;
            num2=(num1&num2)<<1;
            num1=directadd;
        }
        return num1;
    }
}
