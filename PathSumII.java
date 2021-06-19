package src;
import java.util.*;
public class PathSumII {

	public PathSumII() {
		// TODO Auto-generated constructor stub
	}
    public List<List<Integer>> pathSum(TreeNode root, int target) {
    	List<Integer> a = new ArrayList<>();
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	helper(root, target, 0, a, res);
    	return res;
    }
    
    public void helper(TreeNode root, int target, int sum, List<Integer> a, List<List<Integer>> res) {
    	if(root == null)
    		return;
    	sum += root.val;
    	a.add(root.val);
    	if(root.left == null && root.right == null) {
    		if(sum == target) {
    			res.add(new LinkedList(a));
    		}
    		a.remove(a.size()-1);
    		return;
    	}
		if(root.left != null) {
			helper(root.left, target, sum, a, res);
		}
		if(root.right != null) {
			helper(root.right, target, sum, a, res);
		}
		a.remove(a.size()-1);
    }
	public static void main(String[] args) {
		TreeNode two = new TreeNode(2);
		TreeNode seven = new TreeNode(7);
		TreeNode one = new TreeNode(1);
		TreeNode thirteen = new TreeNode(13);
		TreeNode five = new TreeNode(5);
		TreeNode eleveen = new TreeNode(11,seven,two);
		TreeNode four = new TreeNode(4,eleveen, null);
		TreeNode right_four = new TreeNode(4,five, one);
		TreeNode eight = new TreeNode(8,thirteen, right_four);
		TreeNode root_five = new TreeNode(5,four,eight);
		
		PathSumII a = new PathSumII();
		System.out.print(a.pathSum(root_five, 22));
		// TODO Auto-generated method stub

	}

}
