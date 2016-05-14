
public class RecursionExample {

	public static void main(String[] args) {
		RecursionExample fact = new RecursionExample();
		fact.fact(3);
		System.out.println(fact.fact(4));

	}

	// factorial for 4 = (4*3*2*1)

	public int fact(int n) {
		int result;
		if (n == 1){
			return 1;
		}
		result = fact(n - 1) * n;
		return result;

	}
}