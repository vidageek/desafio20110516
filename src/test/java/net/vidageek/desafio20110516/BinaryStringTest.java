package net.vidageek.desafio20110516;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author jonasabreu
 * 
 */
final public class BinaryStringTest {

	@Test
	public void testThatToStringReturnsTheStringPassedToTheConstructor() {
		assertEquals("010101", new BinaryString("010101").toString());
	}

	@Test
	public void testThatJoinJoinsTwoBinaryStrings() {
		assertEquals("011110", new BinaryString("011").join(new BinaryString("110")).toString());
	}

}
