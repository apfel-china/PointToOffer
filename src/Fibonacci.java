
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(2*2);

	}
	/*public static int fibonacci(int n) {
		if(n<=0)
			return 0;
		if(n==1||n==2)
			return 1;
		int preNum=1;
		int prepreNum=1;
		int result=0;
		for(int i=3;i<=n;i++) {
			result=preNum+prepreNum;
			prepreNum=preNum;
			preNum=result;
		}
		return result;
	}*/
	/*public static int fibonacci(int n) {
		if(n<=0)
			return 0;
		if(n==1||n==2)
			return 1;
		return fibonacci(n-2)+fibonacci(n-1);
	}*/
	/*
	 * public class Solution {
    public int JumpFloorII(int target) {
        if(target<=0)
            return 0;
        return 1<<(target-1);
    }*///biantai jump frog

}
