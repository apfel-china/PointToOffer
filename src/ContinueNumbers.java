import java.util.ArrayList;
import java.util.Collections;

public class ContinueNumbers {
	public boolean isContinuous(int [] numbers) {
		if(numbers.length!=5)
			return false;
		ArrayList<Integer> list=new ArrayList<Integer>();
		int zeroNumbers=0,NumbersofGap=0;
		for(int i=0;i<numbers.length;i++) {
			list.add(numbers[i]);
			if(numbers[i]==0)
				zeroNumbers++;
			
		}
		
		Collections.sort(list);
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i)!=0 && list.get(i)==list.get(i+1))
				return false;
			if(list.get(i)!=0)
				NumbersofGap+=list.get(i+1)-list.get(i)-1;
		}
		
		if(NumbersofGap<=zeroNumbers)
			return true;
		else 
			return false;
    }
}
