package net.vidageek.desafio;

public class Fibonacci {

	public static long main(int n) {
		String bin = fibonacci(n);
		return Long.parseLong(bin, 2);
	}
	
	private static String fibonacci (int n) {
		StringBuffer buffer = new StringBuffer();
		
		if (n == 0) {
			buffer.append("0");
		} else if (n == 1) {
			buffer.append("01");
		} else {
			buffer.append(fibonacci(n-1)).append(fibonacci(n-2));
		}
		
		return buffer.toString();
	}

}
