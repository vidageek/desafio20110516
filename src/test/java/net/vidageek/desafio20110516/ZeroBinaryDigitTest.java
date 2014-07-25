package net.vidageek.desafio20110516;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author jonasabreu
 * 
 */
final public class ZeroBinaryDigitTest {

	@Test
	public void testThatAsDecimalPartAlwaysReturnsZero() {
		assertEquals(0L, new ZeroBinaryDigit().asDecimalPart());
	}

}
