package nl.alexvanmanen.fibonnaci;

public class FibLoop implements IFibonacci {
	public long fib(int n) {
		long fib1 = 0, fib2 = 1;
		long[] array = new long[n + 1];
		for (int i = 0; i <= n; i++) {
			array[i] = fib1;
			long temp = fib1;
			fib1 = fib2;
			fib2 = temp + fib2;
		}
		return array[n];
	}

}
