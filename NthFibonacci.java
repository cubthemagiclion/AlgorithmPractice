package src;

public class NthFibonacci {
//AlgoExpert Nth Fibonacci
	public NthFibonacci() {
		// TODO Auto-generated constructor stub
	}

	  public static int getNthFib(int n) {
			if(n == 1) 
				return 0;
			if(n == 2)
				return 1;
			return (getNthFib(n-1) + getNthFib(n-2));
	  }

	public static int getNthFibSolution2(int n) { //O(n) time O(1) space
		if (n == 1)
			return 0;
		if(n == 2)
			return 1;
		int previous_two = 0;
		int previous_one = 1;
		int current = 0;
		for(int i = 3; i <= n; i++){
			current = previous_one + previous_two;
			previous_two = previous_one;
			previous_one = current;

		}
		return current;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
