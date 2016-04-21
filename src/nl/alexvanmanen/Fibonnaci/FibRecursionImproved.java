package nl.alexvanmanen.Fibonnaci;

public class FibRecursionImproved implements IFibonacci {

	@Override
	public long fib(int index) {
		return fib(index, 0, 1);
	}

	public static long fib(int n, long f1, long f2) {
		if (n < 2)
			return n;
		if (n == 2)
			return f1 + f2;
		return fib(n - 1, f2, f2 + f1);
	}
}
