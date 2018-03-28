
public class BalancedBinaryTree {
	public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
            return false;
        return getDepth(root)!=-1;
    }
    public int getDepth(TreeNode root) {
    	if(root==null)
    		return 0;
    	int left=getDepth(root.left);
    	if(left==-1)
    		return -1;
    	int right=getDepth(root.right);
    	if(right==-1)
    		return -1;
    	return Math.abs(left-right)>1?-1:1+Math.max(getDepth(root.left),getDepth(root.right));
    	
    }
}
