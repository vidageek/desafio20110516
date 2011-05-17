package net.vidageek.desafio20110516;

final public class X {
    public static long f(int n) {
        String a = "01", b = "0";
        while (n-- > 0) {
            String c = b;
            b = a;
            a = b + c;
        }
        return stringToLong(b);
    }


    private static long stringToLong(String binaryDigits) {
        return Long.valueOf(binaryDigits, 2);
    }
}
