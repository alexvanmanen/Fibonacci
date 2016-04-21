package nl.alexvanmanen.Fibonnaci;
import static org.junit.Assert.*;

import org.junit.Test;

public class FibRecursionNaive implements IFibonacci {

	@Test
	public void test() {
		int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946};
		for (int i = 0; i < array.length; i++) {
			assertEquals(array[i], new FibRecursionNaive().fib(i));
		}
	}

	@Test//(timeout = 1000)
	public void testPerformance() {
		assertEquals(12586269025L, fib(50));
	}

	public long fib(int i) {
		if (i < 2) return i;
		return fib(i - 1) + fib(i - 2);
	}
	

}
