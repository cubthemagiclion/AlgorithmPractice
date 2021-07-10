
public class Fib {

	public Fib() {
		// TODO Auto-generated constructor stub
	}
	public int fib(int n) {
		//practing dynamic programming in iteractive bottom up optimzed solution
		if (n == 0) return 0;
		if (n == 1) return 1;
		int a = 0;
		int b = 1;
		for (int i = 2; i <= n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	public static void main(String[] args) {
		Fib a = new Fib();
		System.out.print(a.fib(5));
		// TODO Auto-generated method stub

	}

}
