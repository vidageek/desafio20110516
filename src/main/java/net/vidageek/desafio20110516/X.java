package net.vidageek.desafio20110516;

final public class X {
    private static final char LETTER_ZERO = '0';


    public static long f(int n) {
        String a = "01", b = "0";
        while (n-- > 0) {
            String c = b;
            b = a;
            a = b + c;
        }
        return stringToLong(b);
    }


    private static long stringToLong(String b) {
        long l = 0;
        for (int i = 0; i < b.length(); i++) {
            final int j = b.length() - 1 - i;
            final char digit = b.charAt(j);
            l += digitToInt(digit) * twoRaisedTo(i);
        }
        return l;
    }


    private static int digitToInt(final char digit) {
        return (digit - LETTER_ZERO);
    }


    private static long twoRaisedTo(int exponent) {
        return 1L << exponent;
    }
}
