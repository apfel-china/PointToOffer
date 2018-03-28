import java.util.ArrayList;

 

public class PrintTreeFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        ArrayList<TreeNode> quene=new ArrayList<TreeNode>();
        TreeNode t;
        if(root==null)
            return array;
        quene.add(root);
        while(!quene.isEmpty()){
        	t=quene.remove(0);
        	if(t.left!=null) {
        		quene.add(t.left);
        	}
        	if(t.right!=null) {
        		quene.add(t.right);
        	}
        	array.add(t.val);
        }
        return array;   
    }

}
/*
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (treeNode.left != null) {
                queue.offer(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.offer(treeNode.right);
            }
            list.add(treeNode.val);
        }
        return list;
    }
}
*/

