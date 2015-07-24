public class Fibonacci {

	public static int fibonacci(int n) {
		if (n == 1)
			return 0;
		if (n == 2 || n == 3)
			return 1;

		int[] intArray = new int[n];
		intArray[0] = 0;
		intArray[1] = 1;
		intArray[2] = 1;

		for (int i = 3; i <= n - 1; i++) {
			intArray[i] = intArray[i-1] + intArray[i-2];
		}

		return intArray[n - 1];

	}

	public static void main(String[] args) {
		System.out.println(Fibonacci.fibonacci(10));
	}
}
