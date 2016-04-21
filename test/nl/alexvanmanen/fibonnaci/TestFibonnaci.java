package nl.alexvanmanen.fibonnaci;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import nl.alexvanmanen.fibonnaci.FibLoop;
import nl.alexvanmanen.fibonnaci.FibRecursionImproved;
import nl.alexvanmanen.fibonnaci.FibRecursionNaive;
import nl.alexvanmanen.fibonnaci.IFibonacci;

public class TestFibonnaci {

	public void testFib(IFibonacci fib) {
		int[] array = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,
				10946 };
		for (int i = 0; i < array.length; i++) {
			assertEquals(array[i], fib.fib(i));
		}
	}

	@Test
	public void testFibLoop() {
		testFib(new FibLoop());
	}

	@Test
	public void testFibRecursionNaive() {
		testFib(new FibRecursionNaive());
	}

	@Test
	public void testFibRecursionImproved() {
		testFib(new FibRecursionImproved());
	}

	@Test(timeout = 1)
	public void testFibLoopPerformance() {
		assertEquals(12586269025L, new FibLoop().fib(50));
	}

	@Test(timeout = 60000)
	public void testFibRecursionNaivePerformance() {
		assertEquals(12586269025L, new FibRecursionNaive().fib(50));
	}
	
	@Test(timeout = 1)
	public void testFibRecursionImprovedPerformance() {
		assertEquals(12586269025L, new FibRecursionImproved().fib(50));
	}
}
