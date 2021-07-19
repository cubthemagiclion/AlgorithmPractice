import java.util.*;

public class BinaryTreeRightSideView {

	public BinaryTreeRightSideView() {
		// TODO Auto-generated constructor stub
	}
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

	    public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> res = new ArrayList<>();
	        if (null == root) {
	            return res;
	        }
	        
	        Queue<TreeNode> q = new LinkedList<>();
	        q.offer(root);
	        
	        while(!q.isEmpty()) {
	            int size = q.size();
	            TreeNode cur = null;
	            for (int i = 0; i < size; ++i) {
	                cur = q.poll();
	                if (cur.left != null) {
	                    q.offer(cur.left);
	                }
	                if (cur.right != null) {
	                    q.offer(cur.right);
	                }
	            }
	            //so that we dont need to do if i == size - 1
	            res.add(cur.val);
	        }
	        
	        return res;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
