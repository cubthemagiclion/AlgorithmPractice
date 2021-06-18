package src;

public class FindClosestValueInBST {

	public FindClosestValueInBST() {
		// TODO Auto-generated constructor stub
	}
	
	  public static int findClosestValueInBst(BST tree, int target) {
		  int closestValue = tree.value;
		  BST pointer = tree;
		  while(pointer != null) {
			  if(Math.abs(target - pointer.value) < Math.abs(target - closestValue)) {
				  closestValue = pointer.value;
			  }
			  if(target > pointer.value)
				  pointer = pointer.right;
			  else if(target < pointer.value)
				  pointer = pointer.left;
			  else
				  break;
			    
		  }
		    // Write your code here.
		    return closestValue;
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
