import java.util.*;
public class ValidateBST {

	public ValidateBST() {
		// TODO Auto-generated constructor stub
	}


	  public static boolean validateBst(BST tree) {
	    // Write your code here.
			return validatesBST(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
			
	  }
		
		public static boolean validatesBST(BST tree, int min, int max) {
			boolean l = true;
			boolean r = true;
			if (tree.value < min || tree.value >= max)
				return false;
			if(tree.left == null && tree.right == null)
	    	return true;
			if(tree.left != null) {
				l = validatesBST(tree.left, min, tree.value);
			}
			if(tree.right != null) {
				r = validatesBST(tree.right, tree.value, max);
			}
			return l && r;
		}

	  static class BST {
	    public int value;
	    public BST left;
	    public BST right;

	    public BST(int value) {
	      this.value = value;
	    }
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
