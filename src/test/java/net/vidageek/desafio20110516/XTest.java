package net.vidageek.desafio20110516;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jonasabreu
 * 
 */
final public class XTest {

	@Test
	public void t0() {
		Assert.assertEquals(0, X.f(0));
	}

	@Test
	public void t1() {
		Assert.assertEquals(1, X.f(1));
	}

	@Test
	public void t2() {
		Assert.assertEquals(2, X.f(2));
	}

	@Test
	public void t3() {
		Assert.assertEquals(9, X.f(3));
	}

	@Test
	public void t4() {
		Assert.assertEquals(74, X.f(4));
	}

	@Test
	public void t5() {
		Assert.assertEquals(2377, X.f(5));
	}

	@Test
	public void t6() {
		Assert.assertEquals(608586, X.f(6));
	}

	@Test
	public void t7() {
		Assert.assertEquals(4985538889L, X.f(7));
	}

	@Test
	public void t8() {
		Assert.assertEquals(10455432852752714L, X.f(8));
	}

}
