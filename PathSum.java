package src;
import java.util.*;
public class PathSum {

	public PathSum() {
		// TODO Auto-generated constructor stub
	}
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        //corner case
        if(root == null)
            return false;
        return helper(root, 0, targetSum);
}
    
    public boolean helper(TreeNode root, int sum, int target){
        if(root == null)
            return false;
        if(root.left == null && root.right == null)
            return (sum + root.val==target);
        boolean res = false;
        if(root.left != null)
            res = helper(root.left, sum + root.val, target);
        if(root.right != null)
            res = res || helper(root.right, sum + root.val, target);
        return res;
    }
    
	public static void main(String[] args) {
		TreeNode two = new TreeNode(2);
		TreeNode one = new TreeNode(1,two,null);
		PathSum a = new PathSum();
		System.out.print(a.hasPathSum(one, 1));
		// TODO Auto-generated method stub
	}

}
