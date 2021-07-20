import java.util.*;

public class BinaryTreeInOrderTraversalDFS {

	public BinaryTreeInOrderTraversalDFS() {
		// TODO Auto-generated constructor stub
	}
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();     
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        
        while(cur != null || !s.isEmpty()) {
            while (null != cur) {
                s.push(cur);
                cur = cur.left;
            }

            cur = s.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
