
public class MoreThanHalfNum {
	 public int MoreThanHalfNum_Solution(int [] array) {
		 if(array==null)
	            return 0;
	        int count=1;
			 int result=array[0];
			 for(int i=1;i<array.length;i++) {
				 if(count==0) {
					 result=array[i];
					 count=1;
				 }
				 else if(result==array[i])
					 count++;
				 else 
					 count--;
			 }
	        if(checkIsValidArray(array,result))
			    return result;
	        else
	            return 0;
		 }
	    public boolean checkIsValidArray(int[] array,int number){
	        int count=0;
	        for(int i=0;i<array.length;i++){
	            if(array[i]==number)
	                count++;
	        }
	        if(count*2>array.length)
	            return true;
	        else 
	            return false;
	    }
	}
/*
链接：https://www.nowcoder.com/questionTerminal/e8a1b01a2df14cb2b228b30ee6a92163
来源：牛客网

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
         
        for(int i=0;i<array.length;i++){
             
            if(!map.containsKey(array[i])){
               map.put(array[i],1);
            }else{
                int count = map.get(array[i]);
                map.put(array[i],++count);
            }
        }
        Iterator iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry)iter.next();
            Integer key =(Integer)entry.getKey();
            Integer val = (Integer)entry.getValue();
            if(val>array.length/2){
                return key;
            }
        }
        return 0;
}
*/