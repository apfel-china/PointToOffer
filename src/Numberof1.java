
public class Numberof1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOf1(3));
	}
	public static int NumberOf1(int n) {
        if(n==0)
            return 0;
        int count=0;
        while(n!=0){
            count++;
            n=(n-1)&n;
        }
        return count;
    }

}
