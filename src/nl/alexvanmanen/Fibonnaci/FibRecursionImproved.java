package nl.alexvanmanen.Fibonnaci;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibRecursionImproved implements IFibonacci {

	@Override
	public long fib(int index) {
		return fib(index, 0, 1);
	}

	
	public static long fib(int n, long f1, long f2) {
		if (n < 2) return n;
		if (n == 2)	return f1 + f2;
		return fib(n - 1, f2, f2 + f1);
	}
	

	@Test
	public void test2() {
		int[] array = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,
				10946 };
		for (int i = 0; i < array.length; i++) {
			assertEquals(array[i], new FibRecursionImproved().fib(i));
		}
	}

	@Test(timeout = 1000)
	public void testPerformance2() {
		assertEquals(12586269025L, fib(50));

	}
}
