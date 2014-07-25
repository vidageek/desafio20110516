package net.vidageek.desafio20110516;

/**
 * @author jonasabreu
 * 
 */
final public class OneBinaryDigit implements BinaryDigit {

	private final int index;

	public OneBinaryDigit(final int index) {
		this.index = index;
	}

	public long asDecimalPart() {
		return 1L << index;
	}

}
