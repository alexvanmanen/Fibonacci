package nl.alexvanmanen.Fibonnaci;
import static org.junit.Assert.*;

import org.junit.Test;

public class FibLoop implements IFibonacci {

	@Test
	public void test() {
		int[] array = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,
				10946 };
		for (int i = 0; i < array.length; i++) {
			assertEquals(array[i], new FibLoop().fib(i));
		}
	}

	@Test(timeout = 1000)
	public void testPerformance() {
		assertEquals(12586269025L, fib(50));

	}

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
