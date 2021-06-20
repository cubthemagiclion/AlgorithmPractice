package src;
import java.util.*;
public class FindSuccessor {

	public FindSuccessor() {}
	
	//recursive solution but with only O(1) space and O(h) time complexity (h means the height of the tree)
	public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
		BinaryTree cur = node;
		if(cur == null)
			return null;
		if(cur.right != null) {
			return getLeftMostChild(cur.right);
		}
		return getRightMostParent(cur);
		
	}
	
	public BinaryTree getLeftMostChild(BinaryTree node) {
		if(node == null)
			return null;
		while(node.left != null)
			node = node.left;
		return node;
	}
	
	public BinaryTree getRightMostParent(BinaryTree node) {
		if(node.parent != null && node.parent.right == node) {
			node = node.parent;
		}
		return node.parent;
	}
	
	//iterative solution
	public BinaryTree findSuccessor2(BinaryTree tree, BinaryTree node) {
		ArrayList<BinaryTree>a = new ArrayList<BinaryTree>();
		helper2(tree,a);
		for(int i = 0; i< a.size(); i++) {
			if(a.get(i).value == node.value) {
				if(i + 1 < a.size())
					return a.get(i+1);
			}
		}
		return null;
	}
	public void helper2(BinaryTree tree, ArrayList<BinaryTree>a) {
		BinaryTree cur = tree;
		Stack<BinaryTree> s = new Stack<>();
		while(cur != null || !s.isEmpty()) {
			while(cur != null) {
				s.add(cur);
				cur = cur.left;
			}
			if(!s.isEmpty()) {
				cur = s.pop();
				a.add(cur);
				cur = cur.right;
			}
		}
	}
	//recursive solution
	public BinaryTree findSuccessor3(BinaryTree tree, BinaryTree node) {
		BinaryTree cur = tree;
		ArrayList<BinaryTree> a = new ArrayList<BinaryTree>();
		helper3(cur, a);
		for(int i = 0; i< a.size(); i++) {
			if(a.get(i).value == node.value) {
				if(i + 1 < a.size())
					return a.get(i+1);
			}
		}
		return null;
  }
	public void helper3(BinaryTree tree, ArrayList<BinaryTree> a) {
		if(tree == null)
			return;
		if(tree.left != null) {
			helper3(tree.left, a);
		}
		a.add(tree);
		if(tree.right != null)
			helper3(tree.right,a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
