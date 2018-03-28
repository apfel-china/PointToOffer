import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MinNumberBuiltByArray {
	public String PrintMinNumber(int [] numbers) {
        int length=numbers.length;
        String str=new String();
        if(length==0)
            return str;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<length;i++){
            list.add(numbers[i]);
        }
        
        Collections.sort(list,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                String str1=a+""+b;
                String str2=b+""+a;
                return str1.compareTo(str2);
            }
        });
        
        for(int i:list){
            str+=i;
        }
        return str;
    }
}
