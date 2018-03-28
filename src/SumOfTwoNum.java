import java.util.ArrayList;

public class SumOfTwoNum {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(array.length<2)
            return list;
        int head=0;
        int tail=array.length-1;
        int curSum=0;
        while(head<tail){
            curSum=array[head]+array[tail];
            if(curSum==sum){
                list.add(array[head]);
                list.add(array[tail]);
                break;
            }
            if(curSum<sum)
                head++;
            else
                tail--;
        }
        return list;
    }
}
