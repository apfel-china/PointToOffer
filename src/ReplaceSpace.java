
public class ReplaceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("We are");
		System.out.print(replaceSpace(str));

	}	
	public static String replaceSpace(StringBuffer str) {
        int indexofhead=str.length()-1;
        int lengthofStr=str.length();
        int numspace=0;
        if(lengthofStr!=0){
            for(int i=0;i<lengthofStr;i++){
                if(str.charAt(i)==' ')
                    numspace++;
            } 
            str.setLength(lengthofStr+2*numspace);
            int indexoftail=str.length()-1;
            for(;indexofhead>=0;indexofhead--){
                if(str.charAt(indexofhead)==' '){
                    str.setCharAt(indexoftail--,'0');
                    str.setCharAt(indexoftail--,'2');
                    str.setCharAt(indexoftail--,'%');
                    //replace method is not easy to use
                }
                else {
                    str.setCharAt(indexoftail--,str.charAt(indexofhead));
                }
            }
        }
        return str.toString();
    }
	
}

