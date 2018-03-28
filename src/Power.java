
public class Power {
	public static void main(String[] args) {
		System.out.print(power(1,0));
	}
	public static double power(double base,int exponent) {
		if(Math.abs(base)<0.00001 && exponent<0)
			return 0.0;
		int absexponent=Math.abs(exponent);
		double resultfinal=powerAboveZero(base,absexponent);
		if(exponent<0)
			resultfinal=1.0/resultfinal;
		return resultfinal;
		
		
	}
	public static double powerAboveZero(double base,int exponent) {
		if(exponent==1)
			return base;
		if(exponent==0)
			return 1.0;
		double result=powerAboveZero(base,exponent>>1);
		result*=result;
		if((exponent & 0x1)!=0) {
			result*=base;
		}
		return result;
		
	}
}
	
