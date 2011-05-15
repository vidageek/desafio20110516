package net.vidageek.desafio20110516;

import java.util.Iterator;

/**
 * @author jonasabreu
 * 
 */
final public class BinaryString implements Iterable<BinaryDigit> {

	private final String string;

	public BinaryString(final String string) {
		this.string = string;
	}

	public BinaryString join(final BinaryString toBeJoined) {
		return new BinaryString(toString() + toBeJoined.toString());
	}

	@Override
	public String toString() {
		return string;
	}

	public int length() {
		return string.length();
	}

	public BinaryDigit digit(final int index) {
		final char digit = string.charAt(index);
		if (digit == '0') {
			return new ZeroBinaryDigit();
		}
		return new OneBinaryDigit(reversedIndex(index));
	}

	private int reversedIndex(final int index) {
		return string.length() - index - 1;
	}

	public Iterator<BinaryDigit> iterator() {
		return new Iterator<BinaryDigit>() {
			private int index = 0;

			public boolean hasNext() {
				return index < string.length();
			}

			public BinaryDigit next() {
				return digit(index++);
			}

			public void remove() {
			}
		};
	}
}
