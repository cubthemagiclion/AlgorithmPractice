package src;
import java.util.*;

class Program {
  // Do not edit the class below except
  // for the breadthFirstSearch method.
  // Feel free to add new properties
  // and methods to the class.
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> breadthFirstSearch(List<String> array) {
        // Write your code here.
    	Queue<Node> q = new LinkedList<Node>();
    	Node cur = this;
    	q.add(cur);
    	while(!q.isEmpty()) {
    		cur = q.poll();
    		array.add(cur.name);
    		for(Node i: cur.children)
    			q.add(i);
    	}
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
