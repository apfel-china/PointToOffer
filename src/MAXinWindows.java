import java.util.ArrayDeque;
import java.util.ArrayList;

public class MAXinWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        
		ArrayList<Integer> list=new ArrayList<Integer>();
        if(num.length==0 || size>num.length || size==0)
        	return list;
        ArrayDeque<Integer> que=new ArrayDeque<Integer>();
        for(int i=0;i<num.length;i++) {
        	if(que.isEmpty())
        		que.add(i);
        	else if(i-que.peekFirst()+1>size)
        		que.pollFirst();
        	while(!que.isEmpty() && num[que.peekLast()]<=num[i])
        		que.pollLast();
        	que.add(i);
        	if(i-size+1>=0)
        		list.add(num[que.peekFirst()]);	
        }
        return list;
    }

}
