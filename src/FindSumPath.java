import java.util.ArrayList;

public class FindSumPath{ 
	private ArrayList<ArrayList<Integer>> listAll=new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list=new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null)
            return listAll;
        list.add(root.val); 
        if(root.left==null && root.right==null && target-root.val==0){
            listAll.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left,target-root.val);
        FindPath(root.right,target-root.val);
        list.remove(list.size()-1);
        return listAll;
    }
}
