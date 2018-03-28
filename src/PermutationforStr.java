import java.util.ArrayList;
import java.util.Collections;

public class PermutationforStr {
	public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();

        if (str != null && str.length() > 0) {
        	PermutationHelper(str.toCharArray(), 0, res);
        	Collections.sort(res);
        }
        return res;
	}


    private static void PermutationHelper(char[] cs, int i, ArrayList<String> list) {
    	if(i == cs.length - 1) { //解空间的一个叶节点
    		list.add(String.valueOf(cs)); //找到一个解
    	} else {
    		for(int j = i; j < cs.length; ++j) {
    			if(j == i || cs[j] != cs[i]) {
    				swap(cs, i, j);
    				PermutationHelper(cs, i + 1, list);
    				swap(cs, i, j);
    			}
    		}
    	}
    }
    
    public static void swap(char[] str,int i,int j){
        if(str.length==0 || i==j)
            return;
        char t=str[i];
        str[i]=str[j];
        str[j]=t;
    }
   
}