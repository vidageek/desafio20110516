package net.vidageek.desafio20110516;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author jonasabreu
 * 
 */
final public class OneBinaryDigitTest {

	@Test
	public void testThatAsDecimalReturns2ToThePowerOfItsIndex() {
		assertEquals(1L, new OneBinaryDigit(0).asDecimalPart());
		assertEquals(2L, new OneBinaryDigit(1).asDecimalPart());
		assertEquals(4L, new OneBinaryDigit(2).asDecimalPart());
		assertEquals(8L, new OneBinaryDigit(3).asDecimalPart());
		assertEquals(16L, new OneBinaryDigit(4).asDecimalPart());
	}

}
