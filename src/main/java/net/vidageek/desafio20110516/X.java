package net.vidageek.desafio20110516;

final public class X {

	public static long f(int n) {
		String a = "01", b = "0";
		while (n-- > 0) {
			String c = b;
			b = a;
			a = b + c;
		}
		long l = 0;
		for (int i = 0; i < b.length(); l += (b.charAt(b.length() - i + n) - 48) * (1L << i++)) {
		}
		return l;
	}

}
