package nl.alexvanmanen.Fibonnaci;

public class FibRecursionNaive implements IFibonacci {

	public long fib(int i) {
		if (i < 2)
			return i;
		return fib(i - 1) + fib(i - 2);
	}

}
