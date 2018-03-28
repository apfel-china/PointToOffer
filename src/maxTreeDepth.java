import java.util.LinkedList;
import java.util.Queue;

public class maxTreeDepth {
	public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        int depth=0;
        while(!queue.isEmpty()) {
        	depth++;
        	int size=queue.size();
        	for(int i=0;i<size;i++) {
        		TreeNode node=queue.peek();
            	queue.poll();
            	if(node.left!=null)
            		queue.add(node.left);
            	if(node.right!=null)
            		queue.add(node.right);
        	}
        }
        return depth;
	}
	
	/*
	public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
            
    }
    */
}
