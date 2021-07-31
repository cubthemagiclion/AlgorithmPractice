import java.util.*;
/*
 * If the depth of a tree is smaller than 5, then this tree can be represented 
 * by a list of three-digits integers.

For each integer in this list:

The hundreds digit represents the depth D of this node, 1 <= D <= 4.
The tens digit represents the position P of this node in the level it belongs to, 1 <= P <= 8. The position is the same as that in a full binary tree.
The units digit represents the value V of this node, 0 <= V <= 9.
 

Given a list of ascending three-digits integers representing a binary with the depth smaller than 5. You need to return the sum of all paths from the root towards the leaves.

Example 1:

Input: [113, 215, 221]
Output: 12
Explanation: 
The tree that the list represents is:
    3
   / \
  5   1

The path sum is (3 + 5) + (3 + 1) = 12.
Example 2:

Input: [113, 221]
Output: 4
Explanation: 
The tree that the list represents is: 
    3
     \
      1

The path sum is (3 + 1) = 4.
 */
public class PathSumIV {

	public PathSumIV() {
		// TODO Auto-generated constructor stub
	}
	
    class Node{
        int depth;
        int position;
        int value;
        Node left;
        Node right;
        Node parent;
        Node(int d, int p, int v) {
            depth = d;
            position = p;
            value = v;
            left = null;
            right = null;
        }
    }
    private int ultimateSum;
    public int pathSum(int[] nums) {
        ultimateSum = 0;
        List<Node> nodeArray = new ArrayList<>();
        int l = nums.length;
        for (int i = 0; i < l; ++i) {
            int cur = nums[i];
            Node curNode = turnToNode(cur);
            nodeArray.add(curNode);
        }
        //construct the tree

        for (int i = 0; i < l; ++i) {
            Node cur = nodeArray.get(i);
            int left = i + 1;
            //not necessary next 2. might be next many.
            while (left < l && !isLeftNode(cur, nodeArray.get(left))) {
            	++left;
            }
            if (left < l && isLeftNode(cur, nodeArray.get(left))) {
                    cur.left = nodeArray.get(left);
                }
            
            int right = i + 1;
            //not necessary next 2. might be next many.
            while (right < l && !isRightNode(cur, nodeArray.get(right))) {
            	++right;
            }
            if (right < l && isRightNode(cur, nodeArray.get(right))) {
                    cur.right = nodeArray.get(right);
                }
            }
        
        
        //just do a normal dfs then. 
        dfs(nodeArray.get(0), 0);
        return ultimateSum;
    }
    
    public int dfs(Node root, int sum) {
        if (null == root) {
            return 0;
        }
        sum += root.value;
        if (root.left == null && root.right == null) {
            ultimateSum += sum;
        }
        int left = 0;
        if (root.left != null) {
            left = dfs(root.left, sum);
        }
        int right = 0;
        if (root.right != null) {
            right = dfs(root.right, sum);
        }
        
        return left + right;
    }
    
    public boolean isLeftNode(Node cur, Node left) {
        //first, left is next depth
        if (cur.depth + 1 == left.depth
           && (cur.position - 1) * 2 + 1 == left.position) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isRightNode(Node cur, Node right) {
        //first, left is next depth
        if (cur.depth + 1 == right.depth
           && (cur.position - 1) * 2 + 2 == right.position) {
            return true;
        } else {
            return false;
        }
    }
    
    public Node turnToNode(int cur) {
        int hundred = cur / 100;
        int tenth = (cur / 10) % 10;
        int single = cur % 10;
        return new Node(hundred, tenth, single);
    }
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] y = {115,215,224,325,336,446,458};
		PathSumIV a = new PathSumIV();
		System.out.print(a.pathSum(y));
	}

}
