package net.vidageek.desafio20110516;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jonasabreu
 * 
 */
final public class FibonacciWordTest {

	@Test
	public void testThatFibonacciWordAtIndex0Is0() {
		Assert.assertEquals(0, FibonacciWord.atIndex(0).asLong());
	}

	@Test
	public void testThatFibonacciWordAtIndex1Is1() {
		Assert.assertEquals(1, FibonacciWord.atIndex(1).asLong());
	}

	@Test
	public void testThatFibonacciWordAtIndex2Is2() {
		Assert.assertEquals(2, FibonacciWord.atIndex(2).asLong());
	}

	@Test
	public void testThatFibonacciWordAtIndex3Is9() {
		Assert.assertEquals(9, FibonacciWord.atIndex(3).asLong());
	}

	@Test
	public void testThatFibonacciWordAtIndex4Is74() {
		Assert.assertEquals(74, FibonacciWord.atIndex(4).asLong());
	}

	@Test
	public void testThatFibonacciWordAtIndex5Is2377() {
		Assert.assertEquals(2377, FibonacciWord.atIndex(5).asLong());
	}

	@Test
	public void testThatFibonacciWordAtIndex6Is608586() {
		Assert.assertEquals(608586, FibonacciWord.atIndex(6).asLong());
	}

	@Test
	public void testThatFibonacciWordAtIndex7Is4985538889() {
		Assert.assertEquals(4985538889L, FibonacciWord.atIndex(7).asLong());
	}

	@Test
	public void testThatFibonacciWordAtIndex8Is10455432852752714() {
		Assert.assertEquals(10455432852752714L, FibonacciWord.atIndex(8).asLong());
	}

}
