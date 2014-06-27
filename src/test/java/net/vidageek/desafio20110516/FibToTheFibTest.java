package net.vidageek.desafio20110516;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jonasabreu
 * 
 */
final public class FibToTheFibTest {

	@Test
	public void t0() {
		Assert.assertEquals(0, FibToTheFib.fibToTheFib(0));
	}

	@Test
	public void t1() {
		Assert.assertEquals(1, FibToTheFib.fibToTheFib(1));
	}

	@Test
	public void t2() {
		Assert.assertEquals(2, FibToTheFib.fibToTheFib(2));
	}

	@Test
	public void t3() {
		Assert.assertEquals(9, FibToTheFib.fibToTheFib(3));
	}

	@Test
	public void t4() {
		Assert.assertEquals(74, FibToTheFib.fibToTheFib(4));
	}

	@Test
	public void t5() {
		Assert.assertEquals(2377, FibToTheFib.fibToTheFib(5));
	}

	@Test
	public void t6() {
		Assert.assertEquals(608586, FibToTheFib.fibToTheFib(6));
	}

	@Test
	public void t7() {
		Assert.assertEquals(4985538889L, FibToTheFib.fibToTheFib(7));
	}

	@Test
	public void t8() {
		Assert.assertEquals(10455432852752714L, FibToTheFib.fibToTheFib(8));
	}

}
