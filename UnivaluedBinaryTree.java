package src;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class UnivaluedBinaryTree {

	public UnivaluedBinaryTree() {
		// TODO Auto-generated constructor stub
	}

	    public boolean isUnivalTree(TreeNode root) {
	        if(root == null) return true;
	        return helper(root, root.val);
	    }
	    
	    public boolean helper(TreeNode root, int v){
	        boolean result = false;
	        if (root == null)
	            return true;
	        if (root.val == v)
	            result = true;
	        else 
	            return false;
	        if (root.left != null)
	            result = helper(root.left, v);
	        if(root.right != null)
	            result = result && helper(root.right, v);
	        return result;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
