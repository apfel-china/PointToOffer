import java.util.ArrayList;

public class SumofContinuousSequence {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer> > lists=new ArrayList<ArrayList<Integer> >();
		if(sum<3)
			return lists;
		int small=1;
		int big=2;
		int curSum=small+big;
		int mid=(sum+1)>>1;
		while(small<mid) {
			if(curSum==sum) {
				ArrayList<Integer> list=new ArrayList<Integer>();
				for(int i=small;i<=big;i++)
					list.add(i);
				lists.add(list);
				curSum-=small;
                small++;
                big++;
                curSum+=big;
			}
			if(curSum>sum) {
				curSum-=small;
				small++;
			}
			if(curSum<sum) {
				big++;
				curSum+=big;
			}
				
		}
		return lists;
    }
}
