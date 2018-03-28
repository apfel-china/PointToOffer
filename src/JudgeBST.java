
public class JudgeBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)
            return false;
        if(sequence.length==1)
            return true;
        int length=sequence.length;
        return IsBST(sequence,0,length-1);
    }
    public static boolean IsBST(int[] seq,int start,int end){
        if(start-end==0)
            return true;
        int root=seq[end];
        boolean left=true,right=true;
        int i=start,leftstart=0,leftend=0;
        while(i<end && seq[i]<root)
            i++;
        if(i-leftstart>0){
            leftend=i-1;
            left=IsBST(seq,leftstart,leftend);
        }
        int rightstart=i;
        if(leftend<end-1){
        	int j=rightstart;
            while(j<end){
                if(seq[j]<root)
                    return false;
                j++;
            }
            right=IsBST(seq,rightstart,end-1);
        }
        return left&&right;
    }
    public static boolean BST(int[] seq,int start,int end){
        if(start-end>=0)
            return true;
        int root=seq[end];
        int splitIndex;
        for(splitIndex=start;splitIndex<end && seq[splitIndex]<root;splitIndex++);
        for(int i=splitIndex;i<end;i++){
            if(seq[i]<root)
                return false;
        }
        return BST(seq,start,splitIndex-1)&&BST(seq,splitIndex,end-1);
    }
     
}
