public class FoundinArray {
    public boolean Find(int target, int [][] array) {
        boolean found=false;
        if(array.length!=0){
            int rows=array.length,columns=array[0].length;
            int r=0;
            while(columns>0 & r<rows){
                if(target<array[r][columns])
                    columns--;
                else if(target>array[r][columns])
                    r++;
                else {
                    found=true;
                    break;
                }
            }
        }
        return found;
    }
}