package net.vidageek.desafio;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

	@Test
	public void number0() {
		int n = 0;
		long result = Fibonacci.main(n);
		Assert.assertEquals(0L, result);
	}
	
	@Test
	public void number1() {
		int n = 1;
		long result = Fibonacci.main(n);
		Assert.assertEquals(1L, result);
	}
	
	@Test
	public void number2() {
		int n = 2;
		long result = Fibonacci.main(n);
		Assert.assertEquals(2L, result);
	}

	@Test
	public void number3() {
		int n = 3;
		long result = Fibonacci.main(n);
		Assert.assertEquals(9L, result);
	}

	@Test
	public void number4() {
		int n = 4;
		long result = Fibonacci.main(n);
		Assert.assertEquals(74L, result);
	}
}
