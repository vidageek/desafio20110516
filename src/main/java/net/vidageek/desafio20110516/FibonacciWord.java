package net.vidageek.desafio20110516;

final public class FibonacciWord {

	private final BinaryString binaryString;

	private FibonacciWord(final BinaryString binaryString) {
		this.binaryString = binaryString;
	}

	public static FibonacciWord atIndex(final int i) {
		return new FibonacciWord(fibonacciWordAt(i));
	}

	private static BinaryString fibonacciWordAt(final int elementNumber) {
		if (elementNumber == 0) {
			return new BinaryString("0");
		}
		if (elementNumber == 1) {
			return new BinaryString("01");
		}
		return fibonacciWordAt(elementNumber - 1).join(fibonacciWordAt(elementNumber - 2));
	}

	public long asLong() {
		long number = 0;
		for (BinaryDigit digit : binaryString) {
			number += digit.asDecimalPart();
		}
		return number;
	}
}
