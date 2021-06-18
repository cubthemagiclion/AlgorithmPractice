package src;
import java.util.*;
public class BranchSums {

	public BranchSums() {
		// TODO Auto-generated constructor stub
	}
	  public static class BinaryTree {
		    int value;
		    BinaryTree left;
		    BinaryTree right;

		    BinaryTree(int value) {
		      this.value = value;
		      this.left = null;
		      this.right = null;
		    }
		  }

		  public static List<Integer> branchSums(BinaryTree root) {
				ArrayList<Integer> res = new ArrayList<Integer>();
				BinaryTree pointer = root;
				Sums(pointer,pointer.value,res);
		    return res;
		  }
			
			public static void Sums(BinaryTree root, int previousSum,ArrayList<Integer> res){
				if(root.left == null && root.right == null)
					res.add(previousSum);
				if(root.left != null)
					Sums(root.left, previousSum + root.left.value, res);
				if(root.right != null)
					Sums(root.right, previousSum + root.right.value, res);
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
