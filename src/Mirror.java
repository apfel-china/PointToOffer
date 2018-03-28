/*
import java.util.Stack;
 
public class Solution {
    public void Mirror(TreeNode root) {
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left != null||node.right != null){
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
            }
            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }
        }
    }
}*/
public class Mirror{
	public void mirror(TreeNode root) {
        if(root==null)
            return;
        TreeNode temp;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left==null && root.right==null){
            return;
        }
        if(root.left!=null)
            mirror(root.left);
        if(root.right!=null)
            mirror(root.right);
    }
}
