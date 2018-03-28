import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeInZLike {
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > lists=new ArrayList<ArrayList<Integer> >();
        if(pRoot==null)
            return lists;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(pRoot);
        while(!queue.isEmpty()) {
        	
        }
        return lists;
        
    }
}
