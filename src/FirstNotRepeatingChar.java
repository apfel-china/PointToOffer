public class FirstNotRepeatingChar {
	public int firstNotRepeatingChar(String str) {
		int[] array=new int[256];
        if(str.length()==0)
            return -1;
        for(int i=0;i<256;i++)
        	array[i]=0;
        int length=str.length();
        for(int i=0;i<length;i++)
        	array[str.charAt(i)]++;
        for(int j=0;j<length;j++){
            if(array[str.charAt(j)]==1)
                return j;
        }
        return 0;
    }
	/*public int FirstNotRepeatingChar(String str) {
		        LinkedHashMap <Character, Integer> map = new LinkedHashMap<Character, Integer>();
		        for(int i=0;i<str.length();i++){
		            if(map.containsKey(str.charAt(i))){
		                int time = map.get(str.charAt(i));
		                map.put(str.charAt(i), ++time);
		            }
		            else {
		                map.put(str.charAt(i), 1);
		            }
		        }
		        int pos = -1;  
		        int i=0;
		        for(;i<str.length();i++){
		            char c = str.charAt(i);
		            if (map.get(c) == 1) {
		                return i;
		            }
		        }
		        return pos;
		    }
		*/
}
